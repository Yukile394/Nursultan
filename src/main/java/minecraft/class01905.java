package minecraft;

import java.util.stream.Stream;

public interface class01905<T> extends class02055<T> {
   default Stream<class05946<T>> n() {
      return this.z().map(class03529::B);
   }

   default Stream<class03530<T>> t() {
      return this.u().map(class03552::B);
   }

   Stream<class03529<T>> z();

   Stream<class03552<T>> u();
}
