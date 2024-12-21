import React from "react";
import {Link, Outlet} from "react-router-dom";
import Layout from "./Layout";

const Home = () => {
    return (
        <>
            <Layout/>
            <h3>
                <nav>
                    <ul style={{listStyleType: 'none'}}>
                        <li>
                            <Link to={"/customers"}>
                                Customers
                            </Link>
                        </li>
                        <li>
                            <Link to={"/products"}>
                                Products
                            </Link>
                        </li>
                        <li>
                            <Link to={"/services"}>
                                Services
                            </Link>
                        </li>
                        <li>
                            <Link to={"/vendors"}>
                                Vendors
                            </Link>
                        </li>
                    </ul>
                </nav>
            </h3>
            <div id={"main"}>
                <Outlet/>
            </div>
        </>
    )
}

export default Home;