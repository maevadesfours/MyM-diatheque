package mediatheque;

public class PrintOnlyCDsVisitor implements MediathequeVisitor {
    
    @Override
    public void visit(CD cd) {
        System.out.println("Imprimer les infos des CD : " + cd.getTitle());
    }
    
    @Override
    public void visit(Book book) { }
    }