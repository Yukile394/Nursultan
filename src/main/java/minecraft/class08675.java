package minecraft;

import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

class class08675 {
   @Nullable
   public final class08675 N;
   @Nullable
   public class08675 y;
   @Nullable
   public List<class08669> L;
   @Nullable
   public List<class08669> u;
   @Nullable
   public List<class08650> i;
   @Nullable
   public List<class08652> R;
   @Nullable
   public List<class08647> M;

   class08675(@Nullable class08675 var1) {
      super();
      this.N = var1;
   }

   public void y(class08669 var1) {
      if (this.u == null) {
         this.u = new ArrayList<>();
      }

      this.u.add(var1);
   }

   public void N(class08647 var1) {
      if (this.M == null) {
         this.M = new ArrayList<>();
      }

      this.M.add(var1);
   }

   public void N(class08669 var1) {
      if (this.L == null) {
         this.L = new ArrayList<>();
      }

      this.L.add(var1);
   }

   public void N(class08650 var1) {
      if (this.i == null) {
         this.i = new ArrayList<>();
      }

      this.i.add(var1);
   }

   public void N(class08652 var1) {
      if (this.R == null) {
         this.R = new ArrayList<>();
      }

      this.R.add(var1);
   }
}
