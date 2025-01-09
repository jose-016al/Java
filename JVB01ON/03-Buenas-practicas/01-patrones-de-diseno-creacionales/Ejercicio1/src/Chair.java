interface Chair {
    void sitOn();
}

class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sentándose en una silla moderna");
    }
}

class ClassicChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sentándose en una silla clásica");
    }
}
