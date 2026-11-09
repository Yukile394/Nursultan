package minecraft;

import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;
import net.caffeinemc.mods.sodium.client.render.chunk.NonStoringBuilderPool;

public class class01386 {
   private final class03950 N = new class03950();
   private final class03130 y;
   private final class01422 L;
   private final class01422 u;
   private final class01434 i;

   public class01422 L() {
      return this.L;
   }

   public class01386(int var1) {
      super();
      this.y = this.N(var1);
      SequencedMap sequencedmap = class07536.N(new Object2ObjectLinkedOpenHashMap(), var1x -> {
         var1x.put(class05911.B(), this.N.N(class08743.field_60923));
         var1x.put(class05911.Z(), this.N.N(class08743.field_60925));
         var1x.put(class05911.z(), this.N.N(class08743.field_60926));
         N(var1x, class05911.U());
         N(var1x, class05911.y());
         N(var1x, class05911.L());
         N(var1x, class05911.u());
         N(var1x, class05911.i());
         N(var1x, class05911.R());
         var1x.put(class05911.M(), new class02579(786432));
         N(var1x, class06851.R());
         N(var1x, class06851.B());
         N(var1x, class06851.M());
         N(var1x, class06851.Z());
         N(var1x, class06851.i());
      });
      this.L = class01407.N(sequencedmap, new class02579(786432));
      this.i = new class01434();
      SequencedMap sequencedmap1 = class07536.N(new Object2ObjectLinkedOpenHashMap(), var0 -> class08874.m.forEach(var1x -> N(var0, var1x)));
      this.u = class01407.N(sequencedmap1, new class02579(0));
   }

   public class01434 i() {
      return this.i;
   }

   public class01422 u() {
      return this.u;
   }

   public class03130 y() {
      return this.y;
   }

   private class03130 N(int var1) {
      return new NonStoringBuilderPool();
   }

   private static void N(Object2ObjectLinkedOpenHashMap<class07311, class02579> var0, class07311 var1) {
      var0.put(var1, new class02579(var1.method_22722()));
   }

   public class03950 N() {
      return this.N;
   }
}
