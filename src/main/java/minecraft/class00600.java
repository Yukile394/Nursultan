package minecraft;

import Nursultan.class10767;
import Nursultan.class10772;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

class class00600<Value> {
   private final class00607<Value> L;
   final Value N;
   private final List<class07603<Value>> u;
   final boolean y;
   @Nullable
   private Value i;
   private int R;

   private Value L() {
      Object object = this.N;

      for (class07603 class07603 : this.u) {
         Objects.requireNonNull(class07603);
         Object object1 = class07603;

         object = switch (object1) {
            case class10772 class10772 -> (Object)((class10772)object1).applyConstant(object);
            case class07601 class07601 -> (Object)((class07601)object1).applyTimeBased(object, this.R);
            case class10767 class10767 -> (Object)object;
            default -> throw new MatchException(null, null);
         };
      }

      return this.L.N((Value)object);
   }

   class00600(class00607<Value> var1, Value var2, List<class07603<Value>> var3, boolean var4) {
      super();
      this.L = var1;
      this.N = (Value)var2;
      this.u = var3;
      this.y = var4;
   }

   private Value y(class06889 var1, @Nullable class00602 var2) {
      Object object = this.N;

      for (class07603 class07603 : this.u) {
         Objects.requireNonNull(class07603);
         Object object1 = class07603;

         object = switch (object1) {
            case class10772 class10772 -> (Object)((class10772)object1).applyConstant(object);
            case class07601 class07601 -> (Object)((class07601)object1).applyTimeBased(object, this.R);
            case class10767 class10767 -> (Object)((class10767)object1).applyPositional((Value)object, Objects.requireNonNull(var1), var2);
            default -> throw new MatchException(null, null);
         };
      }

      return this.L.N((Value)object);
   }

   public Value y() {
      if (this.i != null) {
         return this.i;
      } else {
         Object object = this.L();
         this.i = (Value)object;
         return (Value)object;
      }
   }

   public void N() {
      this.i = null;
      this.R++;
   }

   public Value N(class06889 var1, @Nullable class00602 var2) {
      return !this.y ? this.y() : this.y(var1, var2);
   }
}
