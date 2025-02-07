public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("Originator: Definindo estado para " + state);
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        System.out.println("Originator: Salvando estado no Memento.");
        return new Memento(state);
    }

    public void restoreStateFromMemento(Memento memento) {
        state = memento.getState();
        System.out.println("Originator: Estado restaurado de Memento para " + state);
    }
}
