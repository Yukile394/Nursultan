package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.irisshaders.iris.mixinterface.ParticleRenderStateExtension;

public class class00987 implements ParticleRenderStateExtension {
   public final List<class00972> N = new ArrayList<>();

   public class00987() {
      super();
   }

   public void N(class04790 var1, class06959 var2) {
      Iterator<class00972> iterator = this.N.iterator();

      while (iterator.hasNext()) {
         iterator.next().submit(var1, var2);
      }
   }

   public void N(class00972 var1) {
      this.N.add(var1);
   }

   public void N() {
      this.N.forEach(class00972::y);
      this.N.clear();
   }

   public void submitWithoutItems(class04790 var1, class06959 var2) {
      for (class00972 class00972 : this.N) {
         if (!(class00972 instanceof class00983)) {
            class00972.submit(var1, var2);
         }
      }
   }
}
