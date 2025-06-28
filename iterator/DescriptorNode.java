public class DescriptorNode<T> {
  long size;
  Node<T> begin;
  Node<T> end;

  public DescriptorNode(long size, Node<T> begin, Node<T> end) {
    this.size = size;
    this.begin = begin;
    this.end = end;
  }
}
