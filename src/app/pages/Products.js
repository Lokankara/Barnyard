import React, { useLayoutEffect, useState } from 'react';
import { getCurrency } from '../Utils';

const Products = () => {
    const [products, setProducts] = useState([]);
    const [vendors, setVendors] = useState(new Map());
    const [loading, setLoading] = useState(true);

    const add = (key, value) => {
        setVendors((prev) => new Map([...prev, [key, value]]));
    };

    useLayoutEffect(() => {
        const getProducts = async () => {
            const res = await fetch('/api/products');
            const products = await res.json();
            setProducts(products);
        };

        const getVendors = async () => {
            const res = await fetch('/api/vendors');
            const vendors = await res.json();
            vendors.forEach((vendor) => {
                const { vendorId } = vendor;
                add(vendorId, vendor);
            });
        };

        Promise.all([getProducts(), getVendors()])
            .then(() => setLoading(false))
            .catch((e) => {
                console.log('Error fetching products or vendors: ' + e);
                setLoading(false);
            });
    }, []);

    if (loading) {
        return <div>Loading...</div>;
    }

    return (
        <table>
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
                <th>Vendor</th>
            </tr>
            </thead>
            <tbody>
            {products.map((product) => {
                const { productId, name, price, vendorId } = product;
                const vendor = vendors.get(vendorId);

                return (
                    <tr key={productId}>
                        <td>{productId}</td>
                        <td>{name}</td>
                        <td>{getCurrency(price)}</td>
                        <td>{vendor ? vendor.name : 'Unknown Vendor'}</td>
                    </tr>
                );
            })}
            </tbody>
        </table>
    );
};

export default Products;
