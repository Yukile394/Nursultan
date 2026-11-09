package minecraft;

import Nursultan.class09111;
import Nursultan.class11340;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class class08658<T> extends class00003<T> {
   private final class00077<T> L;

   public class08658(Function<T, Stream<String>> var1, Function<T, Stream<class01894>> var2, List<T> var3) {
      super(var2, var3);
      this.L = class00077.N(var3, var1);
   }

   @Override
   protected List<T> N(String var1) {
      return this.L.method_4810(var1);
   }

   @Override
   protected List<T> N(String var1, String var2) {
      List list = this.y.y(var1);
      List list1 = this.y.N(var2);
      List list2 = this.L.method_4810(var2);
      class09111 class09111 = new class09111<>(list1.iterator(), list2.iterator(), this.N);
      return ImmutableList.copyOf(new class11340<T>(list.iterator(), class09111, this.N));
   }
}
