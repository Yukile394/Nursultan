package minecraft;

import java.util.List;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public abstract class class00116<T extends class09019> extends class00134<T> {
   public static final int N = 5;

   public class00116(@Nullable class05096 var1, T var2, class08781 var3) {
      super(var1, (T)var2, var3);
   }

   protected void N(class01885 var1, class08770 var2, T var3, class08781 var4) {
      super.N(var1, var2, (T)var3, var4);
      List list = this.N((T)var3, var4).map(var1x -> var2.N(var1x).N()).toList();
      var1.N(N(list, var3.y()));
   }

   protected abstract Stream<class08734> N(T var1, class08781 var2);

   protected void N(class03686 var1, class08770 var2, T var3, class08781 var4) {
      super.N(var1, var2, (T)var3, var4);
      var3.L().ifPresentOrElse(var2x -> var1.y(var2.N(var2x).N()), () -> var1.N(5));
   }
}
