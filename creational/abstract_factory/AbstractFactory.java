package creational.abstract_factory;

public abstract class AbstractFactory {
    abstract IShape getShape(String shape);
    abstract IColor getColor(String color);
}
