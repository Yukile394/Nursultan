package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class class03800 {
   private static final Logger N = LogUtils.getLogger();
   private static final class01894 y = class01894.y("tick");
   private static final class01894 L = class01894.y("load");
   private final class02796 u;
   private List<class07684<class07701>> i = ImmutableList.of();
   private boolean R;
   private class05961 M;

   public class07701 L() {
      return this.u.yu().N(class06984.L).y();
   }

   public class03800(class02796 var1, class05961 var2) {
      super();
      this.u = var1;
      this.M = var2;
      this.y(var2);
   }

   public Iterable<class01894> i() {
      return this.M.y();
   }

   public Iterable<class01894> u() {
      return this.M.N().keySet();
   }

   public List<class07684<class07701>> y(class01894 var1) {
      return this.M.y(var1);
   }

   public void y() {
      if (this.u.yW().Z()) {
         if (this.R) {
            this.R = false;
            List<class07684<class07701>> list = this.M.y(L);
            this.N(list, L);
         }

         this.N(this.i, y);
      }
   }

   private void y(class05961 var1) {
      this.i = List.copyOf(var1.y(y));
      this.R = true;
   }

   private void N(Collection<class07684<class07701>> var1, class01894 var2) {
      class08700.N().N(var2::toString);

      for (class07684 class07684 : var1) {
         this.N(class07684, this.L());
      }

      class08700.N().L();
   }

   public Optional<class07684<class07701>> N(class01894 var1) {
      return this.M.N(var1);
   }

   public void N(class07684<class07701> var1, class07701 var2) {
      class04643 class04643 = class08700.N();
      class04643.N(() -> "function " + var1.N());

      try {
         class01747 class01747 = var1.N(null, this.N());
         class07686.N(var2, var2x -> class01752.N(var2x, class01747, var2, class03102.N));
      } catch (class01878 class01878) {
      } catch (Exception exception) {
         N.warn("Failed to execute function {}", var1.N(), exception);
      } finally {
         class04643.L();
      }
   }

   public void N(class05961 var1) {
      this.M = var1;
      this.y(var1);
   }

   public CommandDispatcher<class07701> N() {
      return this.u.yL().N();
   }
}
