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
        l.RemovedoComeco();
        l.Imprimir();
        System.out.println(l.tamanho());
        //17
        l.EsvaziaLista();
        l.Imprimir();




    }
}
