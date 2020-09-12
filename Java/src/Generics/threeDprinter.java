package Generics;

public class threeDprinter<T extends Material> {
    private T material; //오브젝트는 최상위 클래스이기때문에 모두 오브젝트형으로 변환가능

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString() {
        return material.toString();
    }
    public void doPrinting() {
        material.doPrinting();
    }
}
