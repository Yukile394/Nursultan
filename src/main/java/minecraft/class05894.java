package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public final class class05894 {
   private final class04887 N;
   private final BiConsumer<class07209, class00500> y;
   private final class06069 L;
   private final ObjectArrayList<class07209> u;
   private final ObjectArrayList<class07209> i;
   private final ObjectArrayList<class07209> R;

   public ObjectArrayList<class07209> L() {
      return this.u;
   }

   public class05894(
      class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, Set<class07209> var4, Set<class07209> var5, Set<class07209> var6
   ) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.R = new ObjectArrayList(var6);
      this.u = new ObjectArrayList(var4);
      this.i = new ObjectArrayList(var5);
      this.u.sort(Comparator.comparingInt(class00753::method_10264));
      this.i.sort(Comparator.comparingInt(class00753::method_10264));
      this.R.sort(Comparator.comparingInt(class00753::method_10264));
   }

   public ObjectArrayList<class07209> i() {
      return this.R;
   }

   public ObjectArrayList<class07209> u() {
      return this.i;
   }

   public class06069 y() {
      return this.L;
   }

   public class04887 N() {
      return this.N;
   }

   public void N(class07209 var1, class06667 var2) {
      this.N(var1, class00869.Rc.W().y(var2, true));
   }

   public boolean N(class07209 var1) {
      return this.N.method_16358(var1, class01339::P);
   }

   public void N(class07209 var1, class00500 var2) {
      this.y.accept(var1, var2);
   }

   public boolean N(class07209 var1, Predicate<class00500> var2) {
      return this.N.method_16358(var1, var2);
   }
}
