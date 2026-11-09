package minecraft;

import com.mojang.logging.LogUtils;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class08758 implements class04188 {
   static final Logger N = LogUtils.getLogger();
   public static final class04159 y = new class04159("prepare_spawn");
   public static final int L = 3;
   final class02796 u;
   final class08774 i;
   final class08773 R;
   @Nullable
   private class08733 M;

   public void L() {
      class08733 class08733 = this.M;
      if (class08733 instanceof class08772) {
         ((class08772)class08733).N();
      }

      this.M = null;
   }

   public class08758(class02796 var1, class08774 var2) {
      super();
      this.u = var1;
      this.i = var2;
      this.R = var1.yI();
   }

   public void y() {
      class08733 class08733 = this.M;
      if (class08733 instanceof class08738) {
         ((class08738)class08733).N();
      }
   }

   public class04770 N(class00642 var1, class03713 var2) {
      class08733 class08733 = this.M;
      if (class08733 instanceof class08738) {
         return ((class08738)class08733).N(var1, var2);
      } else {
         throw new IllegalStateException("Player spawn was not ready");
      }
   }

   @Override
   public boolean N() {
      Object object = this.M;

      return switch (object) {
         case null -> false;
         case class08772 class08772 -> {
            class08738 class08738 = ((class08772)object).y();
            if (class08738 != null) {
               this.M = class08738;
               yield true;
            } else {
               yield false;
            }
         }
         case class08738 class08738x -> true;
         default -> throw new MatchException(null, null);
      };
   }

   @Override
   public class04159 method_52375() {
      return y;
   }

   @Override
   public void method_52376(Consumer<class00381<?>> var1) {
      try (class04495 class04495 = new class04495(N)) {
         Optional optional = this.u.Nm().L(this.i).map(var2x -> class08308.N(class04495, this.u.yt(), var2x));
         class04773 class04773 = optional.<class04773>flatMap(var0 -> var0.N(class04773.N)).orElse(class04773.y);
         class05042 class05042 = this.u.yn().o().N();
         class04782 class04782 = class04773.N().map(this.u::N).orElseGet(() -> {
            class04782 class04782x = this.u.N(class05042.N());
            return class04782x != null ? class04782x : this.u.NY();
         });
         CompletableFuture completablefuture = class04773.y().map(CompletableFuture::completedFuture).orElseGet(() -> class05960.N(class04782, class05042.y()));
         class07109 class07109 = class04773.L().orElse(new class07109(class05042.u(), class05042.i()));
         this.M = new class08772(this, class04782, completablefuture, class07109);
      }
   }
}
