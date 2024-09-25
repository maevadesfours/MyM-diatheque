package mediatheque;


public class PrintOnlyBooksVisitor implements MediathequeVisitor {
    
    @Override
    public void visit(Book book) {
        System.out.println("Imprimer les infos des livres : " + book.getTitle());
    }

    @Override
    public void visit(CD cd) { }
}
    

