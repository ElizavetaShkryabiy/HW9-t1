package ru.netology.vk;

public class Action {
    private Delete delete;
    private Pin pin;
    private Edit edit;
    private int history [];

    public Delete getDelete() {
        return delete;
    }

    public void setDelete(Delete delete) {
        this.delete = delete;
    }

    public Pin getPin() {
        return pin;
    }

    public void setPin(Pin pin) {
        this.pin = pin;
    }

    public Edit getEdit() {
        return edit;
    }

    public void setEdit(Edit edit) {
        this.edit = edit;
    }

    public int[] getHistory() {
        return history;
    }

    public void setHistory(int[] history) {
        this.history = history;
    }
}
