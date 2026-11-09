package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public class class02296 {
   static final String N = "server_data";
   static Codec<class02296> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01487.L.lenientOptionalFieldOf("rewarded_players", Set.of()).forGetter(var0x -> var0x.i),
            Codec.LONG.lenientOptionalFieldOf("state_updating_resumes_at", 0L).forGetter(var0x -> var0x.R),
            class06584.y.listOf().lenientOptionalFieldOf("items_to_eject", List.of()).forGetter(var0x -> var0x.M),
            Codec.INT.lenientOptionalFieldOf("total_ejections_needed", 0).forGetter(var0x -> var0x.Z)
         )
         .apply(var0, class02296::new)
   );
   private static final int u = 128;
   private final Set<UUID> i = new ObjectLinkedOpenHashSet();
   private long R;
   private final List<class06584> M = new ObjectArrayList();
   private long B;
   private int Z;
   boolean L;

   long L() {
      return this.R;
   }

   class06584 M() {
      if (this.M.isEmpty()) {
         return class06584.E;
      } else {
         this.Z();
         return Objects.requireNonNullElse(this.M.remove(this.M.size() - 1), class06584.E);
      }
   }

   class02296() {
      super();
   }

   class02296(Set<UUID> var1, long var2, List<class06584> var4, int var5) {
      super();
      this.i.addAll(var1);
      this.R = var2;
      this.M.addAll(var4);
      this.Z = var5;
   }

   public float B() {
      return this.Z == 1 ? 1.0F : 1.0F - class04995.R((float)this.u().size(), 1.0F, (float)this.Z);
   }

   private void Z() {
      this.L = true;
   }

   void i() {
      this.Z = 0;
      this.Z();
   }

   List<class06584> u() {
      return this.M;
   }

   void y(long var1) {
      this.R = var1;
      this.Z();
   }

   Set<UUID> y() {
      return this.i;
   }

   public void y(class08036 var1) {
      this.i.add(var1.method_5667());
      if (this.i.size() > 128) {
         Iterator<UUID> iterator = this.i.iterator();
         if (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
         }
      }

      this.Z();
   }

   void N(long var1) {
      this.B = var1;
   }

   void N(List<class06584> var1) {
      this.M.clear();
      this.M.addAll(var1);
      this.Z = this.M.size();
      this.Z();
   }

   boolean N(class08036 var1) {
      return this.i.contains(var1.method_5667());
   }

   long N() {
      return this.B;
   }

   void N(class02296 var1) {
      this.R = var1.L();
      this.M.clear();
      this.M.addAll(var1.M);
      this.i.clear();
      this.i.addAll(var1.i);
   }

   class06584 R() {
      return this.M.isEmpty() ? class06584.E : Objects.requireNonNullElse(this.M.get(this.M.size() - 1), class06584.E);
   }
}
