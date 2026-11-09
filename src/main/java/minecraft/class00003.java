package minecraft;

import Nursultan.class11340;
import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class class00003<T> implements class00077<T> {
   protected final Comparator<T> N;
   protected final class04468<T> y;

   public class00003(Function<T, Stream<class01894>> var1, List<T> var2) {
      super();
      ToIntFunction tointfunction = class07536.R(var2);
      this.N = Comparator.comparingInt(tointfunction);
      this.y = class04468.N(var2, var1);
   }

   protected List<T> N(String var1, String var2) {
      List list = this.y.y(var1);
      List list1 = this.y.N(var2);
      return ImmutableList.copyOf(new class11340<T>(list.iterator(), list1.iterator(), this.N));
   }

   protected List<T> N(String var1) {
      return this.y.N(var1);
   }

   @Override
   public List<T> method_4810(String var1) {
      int i = var1.indexOf(58);
      return i == -1 ? this.N(var1) : this.N(var1.substring(0, i).trim(), var1.substring(i + 1).trim());
   }
}
