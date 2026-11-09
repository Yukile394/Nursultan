package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class class02041 extends class02040 {
   private final class02062 L;
   private final List<class02070> u = new ArrayList<>();
   private final class02072 i = class02072.Z();

   public class02072 L() {
      return this.i;
   }

   public class02041(int var1, int var2, class02062 var3) {
      this(0, 0, var1, var2, var3);
   }

   public class02041(int var1, int var2, int var3, int var4, class02062 var5) {
      super(var1, var2, var3, var4);
      this.L = var5;
   }

   public class02072 y() {
      return this.i.M();
   }

   public <T extends class02102> T N(T var1, class02072 var2) {
      this.u.add(new class02070(var1, var2));
      return (T)var1;
   }

   public <T extends class02102> T N(T var1, Consumer<class02072> var2) {
      return this.N((T)var1, class07536.N(this.y(), var2));
   }

   public <T extends class02102> T N(T var1) {
      return this.N((T)var1, this.y());
   }

   @Override
   public void N(Consumer<class02102> var1) {
      this.u.forEach(var1x -> var1.accept(var1x.N));
   }

   @Override
   public void N() {
      super.N();
      if (!this.u.isEmpty()) {
         int ix = 0;
         int j = this.L.y(this);

         for (class02070 class02070xxx : this.u) {
            ix += this.L.N(class02070xxx);
            j = Math.max(j, this.L.y(class02070xxx));
         }

         int k = this.L.N(this) - ix;
         int l = this.L.L(this);
         Iterator<class02070> iterator = this.u.iterator();
         class02070 class02070xx = iterator.next();
         this.L.N(class02070xx, l);
         l += this.L.N(class02070xx);
         if (this.u.size() >= 2) {
            class02084 class02084 = new class02084(k, this.u.size() - 1);

            while (class02084.hasNext()) {
               l += class02084.nextInt();
               class02070 class02070x = iterator.next();
               this.L.N(class02070x, l);
               l += this.L.N(class02070x);
            }
         }

         int i1 = this.L.u(this);

         for (class02070 class02070x : this.u) {
            this.L.N(class02070x, i1, j);
         }

         switch (this.L) {
            case field_40789:
               this.y = j;
               break;
            case field_40790:
               this.N = j;
         }
      }
   }
}
