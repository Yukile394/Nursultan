package minecraft;

import Nursultan.class09441;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.spawning.PersistentEntitySectionManagerAccessor;
import org.slf4j.Logger;

public class class01104<T extends class01135>
   implements AutoCloseable,
   PersistentEntitySectionManagerAccessor,
   net.caffeinemc.mods.lithium.mixin.util.accessors.PersistentEntitySectionManagerAccessor,
   net.caffeinemc.mods.lithium.mixin.util.entity_movement_tracking.PersistentEntitySectionManagerAccessor {
   public static final Logger N = LogUtils.getLogger();
   public final Set<UUID> y = Sets.newHashSet();
   public final class01109<T> L;
   private final class01136<T> i;
   private final class01131<T> R;
   public final class01129<T> u;
   private final class01124<T> M;
   private final Long2ObjectMap<class01102> B = new Long2ObjectOpenHashMap();
   private final Long2ObjectMap<class01133> Z = new Long2ObjectOpenHashMap();
   private final LongSet z = new LongOpenHashSet();
   private final Queue<class01130<T>> U = Queues.newConcurrentLinkedQueue();

   public void L(T var1) {
      this.L.u((T)var1);
   }

   public void L() {
      this.Z().forEach(var1 -> {
         if (this.B.get(var1) == class01102.field_27289) {
            this.u(var1);
         } else {
            this.N(var1, var0 -> {});
         }
      });
   }

   private void L(long var1) {
      this.Z.put(var1, class01133.field_27276);
      class07321 class07321 = new class07321(var1);
      this.i.N(class07321).thenAccept(this.U::add).exceptionally(var1x -> {
         N.error("Failed to read chunk {}", class07321, var1x);
         return null;
      });
   }

   private void M(class01135 var1) {
      var1.method_31745(class07062.field_27000);
      var1.method_31744(class01113.N);
   }

   public int M() {
      return this.R.y();
   }

   public class01104(Class<T> var1, class01109<T> var2, class01136<T> var3) {
      super();
      this.R = new class01131<>();
      this.u = new class01129<>(var1, this.B);
      this.B.defaultReturnValue(class01102.field_27289);
      this.Z.defaultReturnValue(class01133.field_27275);
      this.L = var2;
      this.i = var3;
      this.M = new class01103<>(this.R, this.u);
   }

   private void B() {
      this.z.removeIf(var1 -> this.B.get(var1) != class01102.field_27289 ? true : this.u(var1));
   }

   private LongSet Z() {
      LongSet longset = this.u.N();
      ObjectIterator<Entry<class01133>> objectiterator = Long2ObjectMaps.fastIterable(this.Z).iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         if (entry.getValue() == class01133.field_27277) {
            longset.add(entry.getLongKey());
         }
      }

      return longset;
   }

   public class01124<T> i() {
      return this.M;
   }

   public void i(T var1) {
      this.L.y((T)var1);
      this.R.y((T)var1);
   }

   @Override
   public void close() throws IOException {
      this.u();
      this.i.close();
   }

   private boolean u(long var1) {
      if (!this.N(var1, var1x -> var1x.method_31748().forEach(this::M))) {
         return false;
      } else {
         this.Z.remove(var1);
         return true;
      }
   }

   public void u() {
      LongSet longset = this.Z();

      while (!longset.isEmpty()) {
         this.i.N(false);
         this.N();
         longset.removeIf(var1x -> this.B.get(var1x) == class01102.field_27289 ? this.u(var1x) : this.N(var1x, var0 -> {}));
      }

      this.i.N(true);
   }

   public void u(T var1) {
      this.R.N((T)var1);
      this.L.L((T)var1);
   }

   public boolean y(class07321 var1) {
      return ((class01102)this.B.get(var1.y())).N();
   }

   public void y() {
      this.N();
      this.B();
   }

   private void y(long var1) {
      if ((class01133)this.Z.get(var1) == class01133.field_27275) {
         this.L(var1);
      }
   }

   public void y(T var1) {
      this.L.i((T)var1);
   }

   public void y(Stream<T> var1) {
      var1.forEach(var1x -> this.N((T)var1x, false));
   }

   public boolean N(UUID var1) {
      return this.y.contains(var1);
   }

   public void N(long var1, class01101<T> var3) {
      if (var3.N()) {
         this.u.i(var1);
      }
   }

   public boolean N(T var1) {
      return this.N((T)var1, false);
   }

   public void N() {
      class01130 class01130;
      while ((class01130 = this.U.poll()) != null) {
         class01130.y().forEach(var1x -> this.N((T)var1x, true));
         this.Z.put(class01130.N().y(), class01133.field_27277);
      }
   }

   public boolean N(class07321 var1) {
      return ((class01102)this.B.get(var1.y())).N();
   }

   public static <T extends class01135> class01102 N(T var0, class01102 var1) {
      return var0.method_31747() ? class01102.field_27291 : var1;
   }

   public boolean N(class07209 var1) {
      return ((class01102)this.B.get(class07321.N(var1))).N();
   }

   public void N(class07321 var1, class04763 var2) {
      class01102 class01102 = class01102.N(var2);
      this.N(var1, class01102);
   }

   public void N(class07321 var1, class01102 var2) {
      long ix = var1.y();
      if (var2 == class01102.field_27289) {
         this.B.remove(ix);
         this.z.add(ix);
      } else {
         this.B.put(ix, var2);
         this.z.remove(ix);
         this.y(ix);
      }

      this.u.y(ix).forEach(var2x -> {
         class01102 class01102 = var2x.N(var2);
         boolean flag = class01102.y();
         boolean flag1 = var2.y();
         boolean flag2 = class01102.N();
         boolean flag3 = var2.N();
         if (flag2 && !flag3) {
            var2x.y().filter(var0 -> !var0.method_31747()).forEach(this::L);
         }

         if (flag && !flag1) {
            var2x.y().filter(var0 -> !var0.method_31747()).forEach(this::i);
         } else if (!flag && flag1) {
            var2x.y().filter(var0 -> !var0.method_31747()).forEach(this::u);
         }

         if (!flag2 && flag3) {
            var2x.y().filter(var0 -> !var0.method_31747()).forEach(this::y);
         }
      });
   }

   private boolean N(long var1, Consumer<T> var3) {
      class01133 class01133 = (class01133)this.Z.get(var1);
      if (class01133 == class01133.field_27276) {
         return false;
      } else {
         List list = this.u.y(var1).flatMap(var0 -> var0.y().filter(class01135::method_31746)).collect(Collectors.toList());
         if (list.isEmpty()) {
            if (class01133 == class01133.field_27277) {
               this.i.N(new class01130<>(new class07321(var1), ImmutableList.of()));
            }

            return true;
         } else if (class01133 == class01133.field_27275) {
            this.L(var1);
            return false;
         } else {
            this.i.N(new class01130<>(new class07321(var1), list));
            list.forEach(var3);
            return true;
         }
      }
   }

   public void N(Stream<T> var1) {
      var1.forEach(var1x -> this.N((T)var1x, true));
   }

   private boolean N(T var1, boolean var2) {
      if (!this.R((T)var1)) {
         return false;
      } else {
         long ix = class01296.L(var1.method_24515());
         class01101 class01101 = this.u.L(ix);
         class01101.N(var1);
         var1.method_31744(new class09441<>(this, (long)var1, ix, class01101));
         if (!var2) {
            this.L.M((T)var1);
         }

         class01102 class01102 = N(var1, class01101.L());
         if (class01102.y()) {
            this.u((T)var1);
         }

         if (class01102.N()) {
            this.y((T)var1);
         }

         return true;
      }
   }

   public void N(Writer var1) throws IOException {
      class04594 class04594 = class04594.N().N("x").N("y").N("z").N("visibility").N("load_status").N("entity_count").N(var1);
      this.u.N().forEach(var2x -> {
         class01133 class01133 = (class01133)this.Z.get(var2x);
         this.u.N(var2x).forEach(var3 -> {
            class01101 class01101 = this.u.u(var3);
            if (class01101 != null) {
               try {
                  class04594.N(class01296.y(var3), class01296.L(var3), class01296.u(var3), class01101.L(), class01133, class01101.u());
               } catch (IOException ioexception) {
                  throw new UncheckedIOException(ioexception);
               }
            }
         });
      });
   }

   public boolean N(long var1) {
      return this.Z.get(var1) == class01133.field_27277;
   }

   private boolean R(T var1) {
      if (!this.y.add(var1.method_5667())) {
         N.warn("UUID of added entity already exists: {}", var1);
         return false;
      } else {
         return true;
      }
   }

   public String R() {
      return this.y.size() + "," + this.R.y() + "," + this.u.y() + "," + this.Z.size() + "," + this.B.size() + "," + this.U.size() + "," + this.z.size();
   }
}
