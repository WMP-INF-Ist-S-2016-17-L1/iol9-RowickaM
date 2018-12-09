class Director {
    /*kierownik - klasa Kelner*/
    private PizzaBuilder builder;
    public void setBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }
    public Pizza getZestaw() {
        return builder.getZestaw();
    }
    public void zrob() {
        builder.newZestaw();
        builder.rodzajCiasta();
        builder.rodzajSosu();
        builder.zestawSkladnikow();
    }
}