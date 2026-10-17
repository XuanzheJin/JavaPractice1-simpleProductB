package nbcc.simpleproductservletb.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import nbcc.simpleproductservletb.entity.Product;
import nbcc.simpleproductservletb.repository.ProductRepository;
import nbcc.simpleproductservletb.repository.ProductRepositoryFactory;

import java.io.IOException;

@WebServlet("/createProduct")
public class ProductCreateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/product/create.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Product product = getProduct(request);

        ProductRepository productRepo = ProductRepositoryFactory.create();
        productRepo.insert(product);

        response.sendRedirect("products");
    }

    private Product getProduct(HttpServletRequest request) {
        String name = request.getParameter("name");

        String priceString = request.getParameter("price");
        double price = Double.parseDouble(priceString);

        Product product = new Product();


        product.setName(name);
        product.setPrice(price);

        return product;
    }
}
