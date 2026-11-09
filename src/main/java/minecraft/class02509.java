package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangePublisher;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class class02509 implements class02695, ChangePublisher {
   private final class02695 L;
   private Reference2ObjectMap<class02477<?>, Optional<?>> u;
   private boolean i;
   private ChangeSubscriber R;

   @Nullable
   public <T> T L(class02477<? extends T> var1) {
      this.z();
      Object object = this.L.method_58694(var1);
      Optional<?> optional;
      if (object != null) {
         optional = (Optional<?>)this.u.put(var1, Optional.empty());
      } else {
         optional = (Optional<?>)this.u.remove(var1);
      }

      return (T)(optional != null ? optional.orElse(null) : object);
   }

   public class02678 M() {
      if (this.u.isEmpty()) {
         return class02678.N;
      } else {
         this.i = true;
         return new class02678(this.u);
      }
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      Optional<?> optional = (Optional<?>)this.u.get(var1);
      return (T)(optional != null ? optional.orElse(null) : this.L.method_58694(var1));
   }

   public class02509(class02695 var1) {
      this(var1, Reference2ObjectMaps.emptyMap(), true);
   }

   private class02509(class02695 var1, Reference2ObjectMap<class02477<?>, Optional<?>> var2, boolean var3) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class02509 class02509 && this.L.equals(class02509.L) && this.u.equals(class02509.u);
   }

   @Override
   public String toString() {
      return "{" + this.L().map(class02480::toString).collect(Collectors.joining(", ")) + "}";
   }

   @Override
   public int hashCode() {
      return this.L.hashCode() + this.u.hashCode() * 31;
   }

   public class02509 B() {
      this.i = true;
      return new class02509(this.L, this.u, true);
   }

   public class02695 Z() {
      return (class02695)(this.u.isEmpty() ? this.L : this.B());
   }

   @Override
   public Iterator<class02480<?>> iterator() {
      if (this.u.isEmpty()) {
         return this.L.iterator();
      } else {
         ArrayList arraylist = new ArrayList(this.u.size() + this.L.u());
         ObjectIterator var2 = Reference2ObjectMaps.fastIterable(this.u).iterator();

         while (var2.hasNext()) {
            Entry entry = (Entry)var2.next();
            if (((Optional)entry.getValue()).isPresent()) {
               arraylist.add(class02480.N((class02477)entry.getKey(), ((Optional)entry.getValue()).get()));
            }
         }

         for (class02480 class02480 : this.L) {
            if (!this.u.containsKey(class02480.N())) {
               arraylist.add(class02480);
            }
         }

         return arraylist.iterator();
      }
   }

   private void z() {
      this.N(null);
      if (this.i) {
         this.u = new Reference2ObjectArrayMap(this.u);
         this.i = false;
      }
   }

   @Override
   public int u() {
      int ix = this.L.u();
      ObjectIterator<Entry<class02477<?>, Optional<?>>> objectiterator = Reference2ObjectMaps.fastIterable(this.u).iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         boolean flag = ((Optional)entry.getValue()).isPresent();
         boolean flag1 = this.L.N((class02477<?>)entry.getKey());
         if (flag != flag1) {
            ix += flag ? 1 : -1;
         }
      }

      return ix;
   }

   public boolean y(class02477<?> var1) {
      return this.u.containsKey(var1);
   }

   @Nullable
   public <T> T y(class02477<T> var1, @Nullable T var2) {
      this.z();
      Object object = this.L.method_58694(var1);
      Optional<?> optional;
      if (Objects.equals(var2, object)) {
         optional = (Optional<?>)this.u.remove(var1);
      } else {
         optional = (Optional<?>)this.u.put(var1, Optional.ofNullable(var2));
      }

      return (T)(optional != null ? ((Optional<Object>)optional).orElse(object) : object);
   }

   public void y(class02678 var1) {
      this.z();
      this.u.clear();
      this.u.putAll(var1.i);
   }

   @Override
   public Set<class02477<?>> y() {
      if (this.u.isEmpty()) {
         return this.L.y();
      } else {
         ReferenceArraySet referencearrayset = new ReferenceArraySet(this.L.y());
         ObjectIterator<Entry<class02477<?>, Optional<?>>> objectiterator = Reference2ObjectMaps.fastIterable(this.u).iterator();

         while (objectiterator.hasNext()) {
            Entry entry = (Entry)objectiterator.next();
            if (((Optional)entry.getValue()).isPresent()) {
               referencearrayset.add((class02477)entry.getKey());
            } else {
               referencearrayset.remove(entry.getKey());
            }
         }

         return referencearrayset;
      }
   }

   private void N(CallbackInfo var1) {
      if (this.R != null) {
         this.R.lithium$notify(this, 0);
      }
   }

   public void N(class02678 var1) {
      this.z();
      ObjectIterator<Entry<class02477<?>, Optional<?>>> objectiterator = Reference2ObjectMaps.fastIterable(var1.i).iterator();

      while (objectiterator.hasNext()) {
         java.util.Map.Entry entry = (java.util.Map.Entry)objectiterator.next();
         this.N((class02477<?>)entry.getKey(), (Optional<?>)entry.getValue());
      }
   }

   @Nullable
   public <T> T N(class02480<T> var1) {
      return this.y(var1.N(), (T)var1.y());
   }

   private static boolean N(class02695 var0, Reference2ObjectMap<class02477<?>, Optional<?>> var1) {
      ObjectIterator objectiterator = Reference2ObjectMaps.fastIterable(var1).iterator();

      while (objectiterator.hasNext()) {
         java.util.Map.Entry entry = (java.util.Map.Entry)objectiterator.next();
         Object object = var0.method_58694((class02477)entry.getKey());
         Optional optional = (Optional)entry.getValue();
         if (optional.isPresent() && optional.get().equals(object)) {
            return false;
         }

         if (optional.isEmpty() && object == null) {
            return false;
         }
      }

      return true;
   }

   public static class02509 N(class02695 var0, class02678 var1) {
      if (N(var0, var1.i)) {
         return new class02509(var0, var1.i, true);
      } else {
         class02509 class02509 = new class02509(var0);
         class02509.N(var1);
         return class02509;
      }
   }

   public void N(class02695 var1) {
      Iterator<class02480<?>> iterator = var1.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(this);
      }
   }

   private void N(class02477<?> var1, Optional<?> var2) {
      Object object = this.L.method_58694(var1);
      if (var2.isPresent()) {
         if (var2.get().equals(object)) {
            this.u.remove(var1);
         } else {
            this.u.put(var1, var2);
         }
      } else if (object != null) {
         this.u.put(var1, Optional.empty());
      } else {
         this.u.remove(var1);
      }
   }

   public void R() {
      this.z();
      this.u.clear();
   }

   public int lithium$unsubscribe(ChangeSubscriber var1) {
      this.R = ChangeSubscriber.without(this.R, var1);
      return 0;
   }

   public void lithium$subscribe(ChangeSubscriber var1, int var2) {
      if (var2 != 0) {
         throw new UnsupportedOperationException("ComponentMapImpl does not support subscriber data");
      } else {
         this.R = ChangeSubscriber.combine(this.R, 0, var1, 0);
      }
   }
}
