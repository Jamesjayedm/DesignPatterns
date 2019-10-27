package Iterator;

/*
 * 迭代器模式：是 Java和 .Net编程环境中非常常用的设计模式。这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 * 意图：提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
 * 主要解决：不同的方式来遍历整个整合对象。
 */
public interface Iterator {
	boolean hasNext();

	Object next();
}
