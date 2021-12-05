package week7;

public class driver {

    public static void main(String[] args) {
        
        rectange rec = new rectange(5, 4);
        square sq = new square(5);
        prism pr = new prism(5, 6, 7);
        cube cb = new cube(5);
        circle cr = new circle(5);
        cylinder cy = new cylinder(5, 10);

        rec.getInfo();
        sq.getInfo(); 
        pr.getInfo();
        cb.getInfo();
        cr.getInfo();
        cy.getInfo();
    }
    
}
