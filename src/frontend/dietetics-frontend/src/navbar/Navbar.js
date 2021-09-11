import './Navbar.css'

const Navbar = () => {
    return (
        <nav className="navbar">
            <h1>Dietetics application</h1>
            <div className="links">
                <a href="/">Login</a>
                <a href="/register">Register</a>
            </div>
        </nav>
    );
}

export default Navbar;