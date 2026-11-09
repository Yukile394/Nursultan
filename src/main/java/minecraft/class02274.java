package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class class02274 {
   static final String N = "shared_data";
   static Codec<class02274> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06584.N("display_item").forGetter(var0x -> var0x.u),
            class01487.L.lenientOptionalFieldOf("connected_players", Set.of()).forGetter(var0x -> var0x.i),
            Codec.DOUBLE.lenientOptionalFieldOf("connected_particles_range", class02281.y.u()).forGetter(var0x -> var0x.R)
         )
         .apply(var0, class02274::new)
   );
   private class06584 u = class06584.E;
   private Set<UUID> i = new ObjectLinkedOpenHashSet();
   private double R = class02281.y.u();
   boolean L;

   boolean L() {
      return !this.i.isEmpty();
   }

   class02274(class06584 var1, Set<UUID> var2, double var3) {
      super();
      this.u = var1;
      this.i.addAll(var2);
      this.R = var3;
   }

   class02274() {
      super();
   }

   double i() {
      return this.R;
   }

   Set<UUID> u() {
      return this.i;
   }

   public boolean y() {
      return !this.u.R();
   }

   public class06584 N() {
      return this.u;
   }

   void N(class04782 var1, class07209 var2, class02296 var3, class02281 var4, double var5) {
      Set set = var4.N().detect(var1, var4.M(), var2, var5, false).stream().filter(var1x -> !var3.y().contains(var1x)).collect(Collectors.toSet());
      if (!this.i.equals(set)) {
         this.i = set;
         this.R();
      }
   }

   public void N(class06584 var1) {
      if (!class06584.N(this.u, var1)) {
         this.u = var1.t();
         this.R();
      }
   }

   void N(class02274 var1) {
      this.u = var1.u;
      this.i = var1.i;
      this.R = var1.R;
   }

   private void R() {
      this.L = true;
   }
}
