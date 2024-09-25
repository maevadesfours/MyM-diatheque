package mediatheque;

public class PrintCatalogue implements MediathequeVisitor {
    
    @Override
    public void visit(CD cd) {
        System.out.println("Imprimer les infos des CD : " + cd.getTitle());
    }
    
    @Override
    public void visit(Book book) {
        System.out.println("Imprimer les infos des livres : " + book.getTitle());
    }
}
    

