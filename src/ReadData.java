import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadData {

    public List<Product> selectAll() {

        List<Product> productList = new ArrayList<>();

        String sql = "SELECT name, description FROM " + Constants.TABLE_NAME;

        try (Statement stmt = DbConn.connect().createStatement()) {

            try (ResultSet rs = stmt.executeQuery(sql)) {

                while (rs.next()) {
                    productList.add(new Product(
                                    rs.getString("name"),
                                    rs.getString("manufacturer"),
                                    rs.getString("description"),
                                    rs.getInt("price")
                            )
                    );
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }
        return productList;
    }
}
