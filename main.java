public class main {
    public static void main(String[] args) {
        ListaDupla l = new ListaDupla();
        l.Adiciona("Homer");
        l.Adiciona("Marge");
        l.Imprimir();
        l.EsvaziaLista();
        l.Imprimir();
        l.Adiciona("Homer");
        l.Adiciona(0, "Bart");
        l.Adiciona(1, "Moll");
        l.Imprimir();
        l.EsvaziaLista();
        l.Adiciona("Homer");
        l.Adiciona("Bart");
        l.Adiciona(0, "Lisa");
        l.Imprimir();
        System.out.println(l.tamanho());
        l.EsvaziaLista();
        l.Imprimir();
        l.Adiciona("Homer");
        l.Adiciona("Maggie");
        l.Adiciona(0, "Bart");
        l.Adiciona(1, "Marge");
        l.Imprimir();
        l.EsvaziaLista();
        l.Adiciona("Homer");
        l.Adiciona("Bart");
        l.Imprimir();
        System.out.println(l.tamanho());
        // 10 
        // System.out.println(l.Contem("Marge"));
        // System.out.println(l.Contem("Homer"));
        // System.out.println(l.Contem("Bart"));
        // System.out.println(l.Contem("Maggie"));
        System.out.println((l.Contem("Marge") & l.Contem("Homer") & l.Contem("Bart") & l.Contem("Maggie")));
        System.out.println(l.tamanho());
        //11
        l.EsvaziaLista();
        l.Adiciona(0,"Homer");
        l.Adiciona(0, "Bart");
        l.Adiciona("Marge");
        l.Adiciona(1, "Maggie");
        l.Adiciona(0, "Ned Flanders");
        l.Adiciona("Sr. Burns");
        l.Imprimir();
        l.RemovedoFim();
        l.Imprimir();
        l.Remove(1);
        l.Imprimir();
        System.out.println(l.tamanho());
        //15
        // System.out.println(l.Contem("Marge"));
        // System.out.println(l.Contem("Homer"));
        // System.out.println(l.Contem("Bart"));
        // System.out.println(l.Contem("Maggie"));
        System.out.println((l.Contem("Marge") & l.Contem("Homer") & l.Contem("Bart") & l.Contem("Maggie")));
        System.out.println(l.tamanho());
        //16
        l.RemovedoComeco();
        l.Imprimir();
        System.out.println(l.tamanho());
        //17
        // System.out.println(l.Contem("Marge"));
        // System.out.println(l.Contem("Homer"));
        // System.out.println(l.Contem("Bart"));
        // System.out.println(l.Contem("Maggie"));
        System.out.println((l.Contem("Marge") & l.Contem("Homer") & l.Contem("Bart") & l.Contem("Maggie")));
        System.out.println(l.tamanho());
        //18
        l.EsvaziaLista();
        l.Imprimir();


        
        




    }
}
