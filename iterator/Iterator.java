public interface Iterator<T> {
  public boolean hasNext();

  public T getNext();

  public void reset();
}
