package me.designpatterns.singleton;

/**
 * 안전하고 단순하게 enum으로 구현
 */
public enum Settings2  {

    INSTANCE;

    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
