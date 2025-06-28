
public interface List<T> extends Iterator<T> {

  public long size();

  public void add(T value);

  public T get(long index);

  public void clear();

  public boolean isEmpty();

}