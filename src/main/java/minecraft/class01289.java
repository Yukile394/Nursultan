package minecraft;

import Nursultan.class09462;
import Nursultan.class09464;
import Nursultan.class10536;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.Stream;
import net.caffeinemc.mods.lithium.common.ai.MemoryModificationCounter;
import net.caffeinemc.mods.lithium.common.util.collections.MaskedList;
import net.caffeinemc.mods.lithium.mixin.ai.useless_sensors.BrainAccessor;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01289<E extends class07438> implements MemoryModificationCounter, BrainAccessor {
   public static final Logger N = LogUtils.getLogger();
   private final Supplier<Codec<class01289<E>>> y;
   private static final int L = 20;
   private Map<class05378<?>, Optional<? extends class01491<?>>> u;
   private Map<class05340<? extends class05355<? super E>>, class05355<? super E>> i;
   private final Map<Integer, Map<class05359, Set<class04142<? super E>>>> R;
   @Nullable
   private class00607<class05359> M;
   private Map<class05359, Set<Pair<class05378<?>, class05367>>> B;
   private final Map<class05359, Set<class05378<?>>> Z;
   private Set<class05359> z;
   private final Set<class05359> U;
   private class05359 E;
   private long W;
   private ArrayList m;
   private MaskedList P;
   private long s = 1L;

   private void L(class04782 var1, E var2) {
      Iterator iterator = this.i.values().iterator();

      while (iterator.hasNext()) {
         ((class05355)iterator.next()).y(var1, var2);
      }
   }

   @Deprecated
   public Map<class05378<?>, Optional<? extends class01491<?>>> L() {
      return this.u;
   }

   public boolean L(class05359 var1) {
      return this.U.contains(var1);
   }

   public <U> Optional<U> L(class05378<U> var1) {
      Optional<? extends class01491<?>> optional = this.u.get(var1);
      if (optional == null) {
         throw new IllegalStateException("Unregistered memory fetched: " + var1);
      } else {
         return optional.map(class01491::L);
      }
   }

   public void M() {
      this.R.clear();
      this.N(null);
   }

   private ArrayList P() {
      if (this.m == null) {
         this.m();
      }

      return this.m;
   }

   private void T() {
      MaskedList maskedlist = new MaskedList(new ObjectArrayList(), false);
      Iterator iterator = this.R.values().iterator();

      while (iterator.hasNext()) {
         Iterator iterator1 = ((Map)iterator.next()).values().iterator();

         while (iterator1.hasNext()) {
            for (class04142 class04142 : (Set)iterator1.next()) {
               maskedlist.addOrSet(class04142, class04142.method_18921() == class05748.field_18338);
            }
         }
      }

      this.P = maskedlist;
   }

   public class01289(
      Collection<? extends class05378<?>> var1,
      Collection<? extends class05340<? extends class05355<? super E>>> var2,
      ImmutableList<class10536<?>> var3,
      Supplier<Codec<class01289<E>>> var4
   ) {
      super();
      this.u = Maps.newHashMap();
      this.i = Maps.newLinkedHashMap();
      this.R = Maps.newTreeMap();
      this.B = Maps.newHashMap();
      this.Z = Maps.newHashMap();
      this.z = Sets.newHashSet();
      this.U = Sets.newHashSet();
      this.E = class05359.y;
      this.W = -9999L;
      this.y = var4;

      for (class05378 class05378x : var1) {
         this.u.put(class05378x, Optional.empty());
      }

      for (class05340 class05340 : var2) {
         this.i.put(class05340, class05340.N());
      }

      for (class05355 class05355 : this.i.values()) {
         for (class05378<?> class05378 : class05355.N()) {
            this.u.put(class05378, Optional.empty());
         }
      }

      UnmodifiableIterator unmodifiableiterator = var3.iterator();

      while (unmodifiableiterator.hasNext()) {
         class10536 class10536 = (class10536)unmodifiableiterator.next();
         class10536.N(this);
      }

      this.N(var1, var2, var3, var4, null);
      this.y(var1, var2, var3, var4, null);
   }

   public class01289<E> B() {
      class01289 class01289 = new class01289<>(this.u.keySet(), this.i.keySet(), ImmutableList.of(), this.y);

      for (Entry entry : this.u.entrySet()) {
         class05378<?> class05378 = (class05378<?>)entry.getKey();
         if (((Optional)entry.getValue()).isPresent()) {
            class01289.u.put(class05378, (Optional<? extends class01491<?>>)entry.getValue());
         }
      }

      this.N(new CallbackInfoReturnable("", false, class01289));
      return class01289;
   }

   public boolean Z() {
      return this.u.isEmpty() && this.i.isEmpty() && this.R.isEmpty();
   }

   public <U> long i(class05378<U> var1) {
      return this.u.get(var1).<Long>map(class01491::y).orElse(0L);
   }

   private void i(class05359 var1) {
      for (class05359 class05359 : this.U) {
         if (class05359 != var1) {
            Set<class05378<?>> set = this.Z.get(class05359);
            if (set != null) {
               for (class05378<?> class05378 : set) {
                  this.y(class05378);
               }
            }
         }
      }
   }

   public void i() {
      this.u(this.E);
   }

   private void i(class04782 var1, class07438 var2) {
      long ix = var1.N();

      for (class04142 class04142 : this.P()) {
         if (class04142.method_18921() == class05748.field_18337) {
            class04142.method_18922(var1, var2, ix);
            class04142 = this.N(class04142);
         }
      }
   }

   private MaskedList z() {
      if (this.P == null) {
         this.T();
      }

      return this.P;
   }

   private void m() {
      this.m = new ArrayList();
      Iterator iterator = this.R.values().iterator();

      while (iterator.hasNext()) {
         for (Entry entry : ((Map)iterator.next()).entrySet()) {
            class05359 class05359 = (class05359)entry.getKey();
            if (this.U.contains(class05359)) {
               for (class04142 class04142 : (Set)entry.getValue()) {
                  this.m.add(class04142);
               }
            }
         }
      }
   }

   private void U() {
      Map<class05378<?>, Optional<? extends class01491<?>>> map = this.u;
      Set set = this.N(map);
      Iterator iterator = this.y(set);

      while (iterator.hasNext()) {
         Entry entry = (Entry)iterator.next();
         if (((Optional)entry.getValue()).isPresent()) {
            class01491 class01491 = (class01491)((Optional)entry.getValue()).get();
            if (class01491.u()) {
               this.y((class05378)entry.getKey());
            }

            class01491.N();
         }
      }
   }

   private void u(class04782 var1, E var2) {
      long ix = var1.N();
      Iterator iterator = this.z().iterator();

      while (iterator.hasNext()) {
         class04142 class04142 = (class04142)iterator.next();
         class04142.method_18923(var1, var2, ix);
         this.y(var1, var2, null, ix, iterator, class04142);
      }
   }

   private void u(class05359 var1) {
      if (!this.L(var1)) {
         this.i(var1);
         this.U.clear();
         this.U.addAll(this.z);
         this.U.add(var1);
         this.N(var1, null);
      }
   }

   @Nullable
   public <U> Optional<U> u(class05378<U> var1) {
      Optional<? extends class01491<?>> optional = this.u.get(var1);
      return optional == null ? null : optional.map(class01491::L);
   }

   @Deprecated
   public Set<class05359> u() {
      return this.U;
   }

   public <U> boolean y(class05378<U> var1, U var2) {
      return !this.N(var1) ? false : this.<Object>L(var1).filter(var1x -> var1x.equals(var2)).isPresent();
   }

   private void y(Collection var1, Collection var2, ImmutableList var3, Supplier var4, CallbackInfo var5) {
      this.u = new Reference2ObjectOpenHashMap(this.u);
      this.i = new Reference2ReferenceLinkedOpenHashMap(this.i);
      this.B = new Object2ObjectOpenHashMap(this.B);
   }

   private Iterator y(Set var1) {
      Map<class05378<?>, Optional<? extends class01491<?>>> map = this.u;
      return (Iterator)(map instanceof Reference2ObjectOpenHashMap
         ? ((Reference2ObjectOpenHashMap)map).reference2ObjectEntrySet().fastIterator()
         : this.u.entrySet().iterator());
   }

   public static <E extends class07438> Codec<class01289<E>> y(
      Collection<? extends class05378<?>> var0, Collection<? extends class05340<? extends class05355<? super E>>> var1
   ) {
      MutableObject mutableobject = new MutableObject();
      mutableobject.setValue(new class09462(var0, var1, mutableobject).fieldOf("memories").codec());
      return (Codec<class01289<E>>)mutableobject.get();
   }

   public <U> void y(class05378<U> var1, Optional<? extends class01491<?>> var2) {
      if (this.u.containsKey(var1)) {
         if (var2.isPresent() && this.N(((class01491)var2.get()).L())) {
            this.y(var1);
         } else {
            Map<class05378<?>, Optional<? extends class01491<?>>> map = this.u;
            this.N(map, var1, var2);
         }
      }
   }

   private void y(class04782 var1, class07438 var2, CallbackInfo var3, long var4, Iterator var6, class04142 var7) {
      if (this.P != null && var7.method_18921() != class05748.field_18338) {
         this.P.setVisible(var7, false);
      }
   }

   public <U> void y(class05378<U> var1) {
      this.N(var1, Optional.empty());
   }

   public void y() {
      this.u.keySet().forEach(var1 -> this.u.put((class05378<?>)var1, Optional.empty()));
   }

   public void y(class04782 var1, E var2) {
      long ix = var2.method_73183().N();
      Iterator iterator = this.z().iterator();

      while (iterator.hasNext()) {
         class04142 class04142 = (class04142)iterator.next();
         this.N(var1, var2, null, ix, iterator, class04142);
         class04142.method_18925(var1, var2, ix);
      }
   }

   public void y(class05359 var1) {
      this.E = var1;
   }

   private void E() {
      this.P = null;
      this.W();
   }

   private void N(class04782 var1, class07438 var2, CallbackInfo var3, long var4, Iterator var6, class04142 var7) {
      if (this.P != null) {
         this.P.setVisible(var7, false);
      }
   }

   private class04142 N(class04142 var1) {
      if (this.P != null && var1.method_18921() == class05748.field_18338) {
         this.P.setVisible(var1, true);
      }

      return var1;
   }

   private Object N(Map var1, Object var2, Object var3) {
      Object object = var1.put(var2, var3);
      if (object == null || ((Optional)object).isPresent() != ((Optional)var3).isPresent()) {
         this.s++;
      }

      return object;
   }

   private void N(CallbackInfoReturnable var1) {
      ((class01289)var1.getReturnValue()).s = this.s + 1L;
   }

   private UnmodifiableIterator N(ImmutableList var1, Operation var2) {
      Iterator iterator = (Iterator)var2.call(new Object[]{var1});
      return new class09464(this, iterator);
   }

   private Set N(Map var1) {
      return null;
   }

   private void N(Collection var1, Collection var2, ImmutableList var3, Supplier var4, CallbackInfo var5) {
      this.E();
   }

   private void N(class05359 var1, ImmutableList var2, Set var3, Set var4, CallbackInfo var5) {
      this.E();
   }

   private void N(CallbackInfo var1) {
      this.E();
   }

   private void N(class05359 var1, CallbackInfo var2) {
      this.W();
   }

   public void N(Set<class05359> var1) {
      this.z = var1;
   }

   public void N(class00607<class05359> var1) {
      this.M = var1;
   }

   public boolean N_22(class05378<?> var1, class05367 var2) {
      Optional<? extends class01491<?>> optional = this.u.get(var1);
      return optional == null
         ? false
         : var2 == class05367.field_18458 || var2 == class05367.field_18456 && optional.isPresent() || var2 == class05367.field_18457 && optional.isEmpty();
   }

   public <U> void N(class05378<U> var1, Optional<? extends U> var2) {
      this.y(var1, var2.map(class01491::N));
   }

   public void N(class05359 var1) {
      if (this.R(var1)) {
         this.u(var1);
      } else {
         this.i();
      }
   }

   public void N(class00616 var1, long var2, class06889 var4) {
      if (var2 - this.W > 20L) {
         this.W = var2;
         class05359 class05359 = this.M != null ? var1.N(this.M, var4) : class05359.y;
         if (!this.U.contains(class05359)) {
            this.N(class05359);
         }
      }
   }

   public void N(List<class05359> var1) {
      for (class05359 class05359 : var1) {
         if (this.R(class05359)) {
            this.u(class05359);
            break;
         }
      }
   }

   public static <E extends class07438> class05781<E> N(
      Collection<? extends class05378<?>> var0, Collection<? extends class05340<? extends class05355<? super E>>> var1
   ) {
      return new class05781<>(var0, var1);
   }

   public <T> DataResult<T> N(DynamicOps<T> var1) {
      return this.y.get().encodeStart(var1, this);
   }

   public Stream<class10536<?>> N() {
      return this.u.entrySet().stream().map(var0 -> class10536.N(var0.getKey(), var0.getValue()));
   }

   public boolean N(class05378<?> var1) {
      return this.N_22(var1, class05367.field_18456);
   }

   public <U> void N(class05378<U> var1, @Nullable U var2) {
      this.N(var1, Optional.ofNullable(var2));
   }

   public <U> void N(class05378<U> var1, U var2, long var3) {
      this.y(var1, Optional.of(class01491.N(var2, var3)));
   }

   public void N(class05359 var1, ImmutableList<? extends Pair<Integer, ? extends class04142<? super E>>> var2, Set<Pair<class05378<?>, class05367>> var3) {
      this.N(var1, var2, var3, Sets.newHashSet());
   }

   public void N(
      class05359 var1,
      ImmutableList<? extends Pair<Integer, ? extends class04142<? super E>>> var2,
      Set<Pair<class05378<?>, class05367>> var3,
      Set<class05378<?>> var4
   ) {
      this.B.put(var1, var3);
      if (!var4.isEmpty()) {
         this.Z.put(var1, var4);
      }

      UnmodifiableIterator unmodifiableiterator = this.N(var2, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[com.google.common.collect.ImmutableList]");
         return ((ImmutableList)var0[0]).iterator();
      });

      while (unmodifiableiterator.hasNext()) {
         Pair pair = (Pair)unmodifiableiterator.next();
         this.R
            .computeIfAbsent((Integer)pair.getFirst(), var0 -> Maps.newHashMap())
            .computeIfAbsent(var1, var0 -> Sets.newLinkedHashSet())
            .add((class04142<? super E>)pair.getSecond());
      }

      this.N(var1, var2, var3, var4, null);
   }

   ImmutableList<? extends Pair<Integer, ? extends class04142<? super E>>> N(int var1, ImmutableList<? extends class04142<? super E>> var2) {
      int ix = var1;
      Builder builder = ImmutableList.builder();
      UnmodifiableIterator unmodifiableiterator = var2.iterator();

      while (unmodifiableiterator.hasNext()) {
         class04142 class04142 = (class04142)unmodifiableiterator.next();
         builder.add(Pair.of(ix++, class04142));
      }

      return builder.build();
   }

   public void N(class04782 var1, E var2) {
      this.U();
      this.L(var1, (E)var2);
      this.i(var1, var2);
      this.u(var1, (E)var2);
   }

   private boolean N(Object var1) {
      return var1 instanceof Collection && ((Collection)var1).isEmpty();
   }

   public void N(class05359 var1, int var2, ImmutableList<? extends class04142<? super E>> var3, class05378<?> var4) {
      ImmutableSet immutableset = ImmutableSet.of(Pair.of(var4, class05367.field_18456));
      ImmutableSet immutableset1 = ImmutableSet.of(var4);
      this.N(var1, this.N(var2, var3), immutableset, immutableset1);
   }

   public void N(class05359 var1, int var2, ImmutableList<? extends class04142<? super E>> var3) {
      this.N(var1, this.N(var2, var3));
   }

   public void N(class05359 var1, int var2, ImmutableList<? extends class04142<? super E>> var3, Set<Pair<class05378<?>, class05367>> var4) {
      this.N(var1, this.N(var2, var3), var4);
   }

   public void N(class05359 var1, ImmutableList<? extends Pair<Integer, ? extends class04142<? super E>>> var2) {
      this.N(var1, var2, ImmutableSet.of(), Sets.newHashSet());
   }

   private void W() {
      this.m = null;
   }

   private boolean R(class05359 var1) {
      if (!this.B.containsKey(var1)) {
         return false;
      } else {
         for (Pair<class05378<?>, class05367> pair : this.B.get(var1)) {
            class05378<?> class05378 = (class05378<?>)pair.getFirst();
            class05367 class05367 = (class05367)pair.getSecond();
            if (!this.N_22(class05378, class05367)) {
               return false;
            }
         }

         return true;
      }
   }

   public Optional<class05359> R() {
      for (class05359 class05359 : this.U) {
         if (!this.z.contains(class05359)) {
            return Optional.of(class05359);
         }
      }

      return Optional.empty();
   }

   public long lithium$getModCount() {
      return this.s;
   }
}
