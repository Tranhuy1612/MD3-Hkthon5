package ra.run;

import ra.config.InputMethods;
import ra.model.Catalog;
import ra.model.Product;

import java.util.ArrayList;
import java.util.List;

public class BookManagement {
    static List<Catalog> catalogs = new ArrayList<>();
    static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("**************************BASIC-MENU************************** \n" +
                    "1. Quản lý danh mục [5 điểm]\n" +
                    "2. Quản lý sản phẩm [5 điểm]\n" +
                    "3. Thoát");
            System.out.println("Nhap vao lua chon cua ban");
            int choice = InputMethods.getInteger();
            switch (choice) {
                case 1:
                    CatalogManagement();
                    break;
                case 2:
                    ProductManagement();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.err.println("khong hop le, thu lai");
            }
        }
    }

    public static void CatalogManagement() {
        byte choice = 0;
        while (choice != 5) {
            System.out.println("********************CATALOG-MANAGEMENT********************\n" +
                    "1. Nhập số danh mục thêm mới và nhập thông tin cho từng danh mục [5 điểm]\n" +
                    "2. Hiển thị thông tin tất cả các danh mục [5 điểm]\n" +
                    "3. Sửa tên danh mục theo mã danh mục [5 điểm]\n" +
                    "4. Xóa danh muc theo mã danh mục (lưu ý ko xóa khi có sản phẩm) [5 điểm]\n" +
                    "5. Quay lại");
            System.out.println("Nhập vào  lựa chọn của bạn");
            choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    createCatalog();
                    break;
                case 2:
                    showCatalog();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.err.println("Phải nhâp số từ 1 đến 4");
                    break;
            }
        }
    }

    public static void createCatalog() {
        System.out.println("Nhập số danh mục thêm mới ");
        int so = InputMethods.getInteger();
        for (int i = 0; i < so; i++) {
            System.out.println("--------nhập thông tin cho từng danh mục---------");
            Catalog catalog = new Catalog();
            catalog.inputData();
            catalogs.add(catalog);
        }
    }

    public static void showCatalog() {
        System.out.println("********** Hiển thị Catalog **********");
        for (Catalog catalog : catalogs) {
            System.out.println(catalog);
        }
        System.out.println("***************************************");
    }



    public static void ProductManagement() {
        byte choice = 0;
        while (choice != 7) {
            System.out.println("********************PRODUCT-MANAGEMENT********************\n" +
                    "1. Nhập số sản sản phẩm và nhập thông tin sản phẩm [5 điểm]\n" +
                    "2. Hiển thị thông tin các sản phẩm [5 điểm]\n" +
                    "3. Sắp xếp sản phẩm theo giá giảm dần [5 điểm]\n" +
                    "4. Xóa sản phẩm theo mã [5 điểm]\n" +
                    "5. Tìm kiếm sách theo tên sách [10 điểm]\n" +
                    "6. Thay đổi thông tin của sách theo mã sách [10 điểm]\n" +
                    "7. Quay lại");
            choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    createProduct();
                    break;
                case 2:
                    ShowProduct();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.err.println("Phải nhâp số từ 1 đến 7");
                    break;
            }
        }
    }

    public static void createProduct() {
        System.out.println("Nhập số sản phẩm thêm mới ");
        int so = InputMethods.getInteger();
        for (int i = 0; i < so; i++) {
            System.out.println("--------nhập thông tin cho từng sản phẩm---------");
            Product product = new Product();
            product.inputData();
            products.add(product);
        }
    }

    public static void ShowProduct() {
        System.out.println("********** Hiển thị Product **********");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("***************************************");
    }
}
