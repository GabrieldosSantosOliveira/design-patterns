
public class LinkedList<T> implements List<T> {
  private long currentIndexIterator = 0;
  private DescriptorNode<T> descriptorNode = new DescriptorNode<>(0, null, null);

  @Override
  public long size() {
    return descriptorNode.size;
  }

  @Override
  public void add(T value) {
    if (descriptorNode.end == null) {
      Node<T> node = new Node<T>(value);
      descriptorNode.end = node;
      descriptorNode.begin = node;
      descriptorNode.size++;
      return;
    }
    Node<T> node = new Node<T>(value, null);
    descriptorNode.end.next = node;
    descriptorNode.end = node;
    descriptorNode.size++;
  }

  @Override
  public T get(long index) {
    Node<T> node = descriptorNode.begin;
    long i = 0;
    while (node != null) {
      if (i == index) {
        return node.value;
      }
      node = node.next;
      i++;
    }
    return null;
  }

  @Override
  public void clear() {
    Node<T> node = descriptorNode.begin;
    Node<T> tmp;

    while (node != null) {
      tmp = node;
      node = node.next;
      tmp = null;
    }
    descriptorNode.begin = null;
    descriptorNode.end = null;
    descriptorNode.size = 0;
  }

  @Override
  public boolean isEmpty() {
    if (descriptorNode.size == 0) {
      return true;
    }
    return false;
  }

  @Override
  public boolean hasNext() {
    if (currentIndexIterator < size()) {
      return true;
    }
    return false;
  }

  @Override
  public T getNext() {
    T value = get(currentIndexIterator);
    currentIndexIterator++;
    return value;
  }

  @Override
  public void reset() {
    currentIndexIterator = 0;
  }

}
