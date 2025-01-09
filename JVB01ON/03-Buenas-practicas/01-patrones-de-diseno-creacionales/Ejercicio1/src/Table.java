interface Table {
    void putOn();
}

class ModernTable implements Table {
    @Override
    public void putOn() {
        System.out.println("Colocando objetos en una mesa moderna");
    }
}

class ClassicTable implements Table {
    @Override
    public void putOn() {
        System.out.println("Colocando objetos en una mesa clásica");
    }
}
