public class Product {

    private String name;
    private Object article;

    public Product(String name, Object article) {
        this.name = name;
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getArticle() {
        return article;
    }

    public void setArticle(Object article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", article=" + article +
                '}';
    }
}
