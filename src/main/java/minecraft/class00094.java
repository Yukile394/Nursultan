package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import org.joml.Vector3f;

public class class00094 {
   private final class04353 N;
   private final List<class00121> y;

   private class00094(class04353 var1, List<class00121> var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public void N(class04396 var1, float var2, float var3) {
      var1.N(var3x -> this.N((long)((float)var3x.N(var2) * var3), 1.0F));
   }

   public void N(long var1, float var3) {
      float f = this.N(var1);
      Vector3f vector3f = new Vector3f();
      Iterator<class00121> iterator = this.y.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(f, var3, vector3f);
      }
   }

   private float N(long var1) {
      float f = (float)var1 / 1000.0F;
      return this.N.y() ? f % this.N.N() : f;
   }

   static class00094 N(class01686 var0, class04353 var1) {
      ArrayList arraylist = new ArrayList();
      Function<String, class01686> function = var0.R();

      for (Entry entry : var1.L().entrySet()) {
         String s = (String)entry.getKey();
         List<class04373> list = (List<class04373>)entry.getValue();
         class01686 class01686 = function.apply(s);
         if (class01686 == null) {
            throw new IllegalArgumentException("Cannot animate " + s + ", which does not exist in model");
         }

         for (class04373 class04373 : list) {
            arraylist.add(new class00121(class01686, class04373.N(), class04373.y()));
         }
      }

      return new class00094(var1, List.copyOf(arraylist));
   }

   public void N() {
      this.N(0L, 1.0F);
   }

   public void N(float var1, float var2, float var3, float var4) {
      long i = (long)(var1 * 50.0F * var3);
      float f = Math.min(var2 * var4, 1.0F);
      this.N(i, f);
   }

   public void N(class04396 var1, float var2) {
      this.N(var1, var2, 1.0F);
   }
}
