import React, {useLayoutEffect, useState} from "react";

const Customers = () => {
    const [customers, setCustomers] = useState([]);

    useLayoutEffect(() => {
        const getCustomers = async () => {
            const res = await fetch('/api/customers')
            const customers = await res.json()
            setCustomers(customers);
        }
        getCustomers().catch(e => console.log("Error fetching customers"));
    })
    return (
        <table>
            <thead>
            <tr>
                <th>Id</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Address</th>
            </tr>
            </thead>
            <tbody>
            {customers.map((customer) => {
                const {customerId, firstName, lastName, email, phone, address} = customer;
                return (
                    <tr key={customerId}>
                        <td>{customerId}</td>
                        <td>{firstName}</td>
                        <td>{lastName}</td>
                        <td>{email}</td>
                        <td>{phone}</td>
                        <td>{address}</td>
                    </tr>)
            })}
            </tbody>
        </table>
    )
}

export default Customers;