package minecraft;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.Reference2IntMap;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.registry.FabricRegistry;
import net.fabricmc.fabric.api.event.registry.RegistryAttribute;
import net.fabricmc.fabric.api.event.registry.RegistryAttributeHolder;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.fabricmc.fabric.api.event.registry.RegistryIdRemapCallback;
import net.fabricmc.fabric.api.event.registry.RegistryIdRemapCallback.RemapState;
import net.fabricmc.fabric.impl.registry.sync.ListenableRegistry;
import net.fabricmc.fabric.impl.registry.sync.RegistrySyncManager;
import net.fabricmc.fabric.impl.registry.sync.RemapException;
import net.fabricmc.fabric.impl.registry.sync.RemapStateImpl;
import net.fabricmc.fabric.impl.registry.sync.RemappableRegistry;
import net.fabricmc.fabric.impl.registry.sync.RemappableRegistry.RemapMode;
import net.fabricmc.fabric.impl.tag.SimpleRegistryExtension;
import net.fabricmc.fabric.impl.tag.TagAliasEnabledRegistryWrapper;
import net.fabricmc.fabric.mixin.registry.sync.MappedRegistryAccessor;
import net.fabricmc.fabric.mixin.tag.SimpleRegistryTagLookup2Accessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00731<T>
   implements class07099<T>,
   FabricRegistry,
   ListenableRegistry,
   RemappableRegistry,
   SimpleRegistryExtension,
   TagAliasEnabledRegistryWrapper,
   MappedRegistryAccessor {
   private final class05946<? extends class00751<T>> i;
   private final ObjectList<class03529<T>> R;
   private final Reference2IntMap<T> M;
   private final Map<class01894, class03529<T>> B;
   private final Map<class05946<T>, class03529<T>> Z;
   private final Map<T, class03529<T>> z;
   public final Map<class05946<T>, class02819> y;
   private Lifecycle U;
   private final Map<class03530<T>, class03552<T>> E;
   class00752<T> L;
   public boolean u;
   @Nullable
   private Map<T, class03529<T>> W;
   private static final Set m = Set.of("minecraft", "brigadier");
   private static final Logger P = LoggerFactory.getLogger(class00731.class);
   private Event s;
   private Event T;
   private Object2IntMap b;
   private BiMap j;
   private Map v = new HashMap();
   private static final Logger n = LoggerFactory.getLogger("fabric-tag-api-v1");
   private Map t;

   public void fabric_refreshTags() {
      this.m();
   }

   @Override
   public Optional<class03529<T>> L(int var1) {
      return var1 >= 0 && var1 < this.R.size() ? Optional.ofNullable((class03529<T>)this.R.get(var1)) : Optional.empty();
   }

   @Nullable
   @Override
   public T L(@Nullable class05946<T> var1) {
      var1 = this.W(var1);
      return N(this.Z.get(var1));
   }

   @Override
   public Optional<class03529<T>> L(class01894 var1) {
      var1 = this.i(var1);
      return Optional.ofNullable(this.B.get(var1));
   }

   @Override
   public int L() {
      return this.Z.size();
   }

   class03552<T> L(class03530<T> var1) {
      return this.E.computeIfAbsent(var1, this::i);
   }

   @Override
   public Set<class01894> M() {
      return Collections.unmodifiableSet(this.B.keySet());
   }

   public void P() {
      this.y();
      this.E.values().forEach(var0 -> var0.y(List.of()));
   }

   public class00731(class05946<? extends class00751<T>> var1, Lifecycle var2) {
      this(var1, var2, false);
   }

   public class00731(class05946<? extends class00751<T>> var1, Lifecycle var2, boolean var3) {
      super();
      this.R = new ObjectArrayList(256);
      this.M = class07536.N(new Reference2IntOpenHashMap(), var0 -> var0.defaultReturnValue(-1));
      this.B = new HashMap<>();
      this.Z = new HashMap<>();
      this.z = new IdentityHashMap<>();
      this.y = new IdentityHashMap<>();
      this.E = new IdentityHashMap<>();
      this.L = class00752.N();
      this.i = var1;
      this.U = var2;
      if (var3) {
         this.W = new IdentityHashMap<>();
      }

      this.N(var1, var2, var3, null);
   }

   @Override
   public String toString() {
      return "Registry[" + this.i + " (" + this.U + ")]";
   }

   @Override
   public Set<class05946<T>> B() {
      return Collections.unmodifiableSet(this.Z.keySet());
   }

   @Override
   public Set<Entry<class05946<T>, T>> Z() {
      return Collections.unmodifiableSet(class07536.<class05946<T>, class03529<T>, T>N(this.Z, class03556::N).entrySet());
   }

   private void Z(class05946<T> var1) {
      if (this.u) {
         throw new IllegalStateException("Registry is already frozen (trying to add key " + var1 + ")");
      }
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.transform(this.R.iterator(), class03556::N);
   }

   @Override
   public Optional<class02819> i(class05946<T> var1) {
      var1 = this.W(var1);
      return Optional.ofNullable(this.y.get(var1));
   }

   private class01894 i(class01894 var1) {
      return this.v.getOrDefault(var1, var1);
   }

   private class03552<T> i(class03530<T> var1) {
      return new class03552<>(this, (class03530<T>)var1);
   }

   @Override
   public class05946<? extends class00751<T>> i() {
      return this.i;
   }

   @Override
   public class03556<T> i(T var1) {
      class03529 class03529 = this.z.get(var1);
      return (class03556<T>)(class03529 != null ? class03529 : class03556.N((T)var1));
   }

   @Override
   public class02055<T> s() {
      this.y();
      return new class00745<>(this);
   }

   void m() {
      IdentityHashMap identityhashmap = new IdentityHashMap();
      this.Z.values().forEach(var1x -> identityhashmap.put(var1x, new ArrayList()));
      this.L.N((var2, var3) -> {
         for (class03556 class03556 : var3) {
            class03529 class03529 = this.N((class03530<T>)var2, class03556);
            ((List)identityhashmap.get(class03529)).add(var2);
         }
      });
      identityhashmap.forEach(class03529::N);
   }

   @Override
   public Stream<class03552<T>> U() {
      return this.L.L();
   }

   @Override
   public Stream<class03529<T>> z() {
      return this.R.stream();
   }

   @Override
   public boolean u(class01894 var1) {
      var1 = this.i(var1);
      return this.B.containsKey(var1);
   }

   @Override
   public Stream<class03552<T>> u() {
      return this.U();
   }

   class03529<T> u(class05946<T> var1) {
      var1 = this.W(var1);
      return this.Z.computeIfAbsent(var1, var1x -> {
         if (this.W != null) {
            throw new IllegalStateException("This registry can't create new holders without value");
         } else {
            this.Z((class05946<T>)var1x);
            return class03529.N_40(this, (class05946<T>)var1x);
         }
      });
   }

   @Override
   public Optional<class05946<T>> u(T var1) {
      return Optional.ofNullable(this.z.get(var1)).map(class03529::B);
   }

   @Nullable
   @Override
   public class01894 y(T var1) {
      class03529 class03529 = this.z.get(var1);
      return class03529 != null ? class03529.B().N() : null;
   }

   private void y() {
      if (this.u) {
         throw new IllegalStateException("Registry is already frozen");
      }
   }

   @Override
   public boolean E() {
      return this.Z.isEmpty();
   }

   private void E(class05946 var1) {
      if ((RegistrySyncManager.postBootstrap || !m.contains(var1.N().y())) && !RegistryAttributeHolder.get(this.i()).hasAttribute(RegistryAttribute.MODDED)) {
         class01894 class01894 = this.i().N();
         P.debug("Registry {} has been marked as modded, registry entry {} was changed", class01894, var1.N());
         RegistryAttributeHolder.get(this.i()).addAttribute(RegistryAttribute.MODDED);
      }
   }

   @Override
   public int N(@Nullable T var1) {
      return this.M.getInt(var1);
   }

   @Override
   public Optional<class03529<T>> N(class06069 var1) {
      return class07536.y_9(this.R, var1);
   }

   private void N(class05946 var1, Lifecycle var2, boolean var3, CallbackInfo var4) {
      this.s = EventFactory.createArrayBacked(RegistryEntryAddedCallback.class, var0 -> (var1x, var2x, var3x) -> {
         RegistryEntryAddedCallback[] aregistryentryaddedcallback = var0;
         int ix = var0.length;

         for (int jx = 0; jx < ix; jx++) {
            aregistryentryaddedcallback[jx].onEntryAdded(var1x, var2x, var3x);
         }
      });
      this.s
         .register(
            (RegistryEntryAddedCallback)(var1x, var2x, var3x) -> {
               if (this.v.containsKey(var2x)) {
                  throw new IllegalArgumentException(
                     "Tried registering %s to registry %s, but it is already an alias (for %s)".formatted(var2x, this.i, this.v.get(var2x))
                  );
               }
            }
         );
      this.T = EventFactory.createArrayBacked(RegistryIdRemapCallback.class, var0 -> var1x -> {
         RegistryIdRemapCallback[] aregistryidremapcallback = var0;
         int ix = var0.length;

         for (int jx = 0; jx < ix; jx++) {
            aregistryidremapcallback[jx].onRemap(var1x);
         }
      });
   }

   private class03529<T> N(class03530<T> var1, class03556<T> var2) {
      if (!var2.N(this)) {
         throw new IllegalStateException("Can't create named set " + var1 + " containing value " + var2 + " from outside registry " + this);
      } else if (var2 instanceof class03529) {
         return (class03529<T>)var2;
      } else {
         throw new IllegalStateException("Found direct holder " + var2 + " value in tag " + var1);
      }
   }

   @Nullable
   @Override
   public T N(int var1) {
      return (T)(var1 >= 0 && var1 < this.R.size() ? ((class03529)this.R.get(var1)).N() : null);
   }

   private void N(class05946 var1, Object var2, class02819 var3, CallbackInfoReturnable var4) {
      ((class03529)var4.getReturnValue()).y(var2);
      ((RegistryEntryAddedCallback)this.s.invoker()).onEntryAdded(this.M.getInt(var2), var1.N(), var2);
      this.E(var1);
   }

   @Override
   public class03529<T> N(class05946<T> var1, T var2, class02819 var3) {
      this.Z(var1);
      Objects.requireNonNull(var1);
      Objects.requireNonNull(var2);
      if (this.B.containsKey(var1.N())) {
         throw (IllegalStateException)class07536.y(new IllegalStateException("Adding duplicate key '" + var1 + "' to registry"));
      } else if (this.z.containsKey(var2)) {
         throw (IllegalStateException)class07536.y(new IllegalStateException("Adding duplicate value '" + var2 + "' to registry"));
      } else {
         class03529 class03529;
         if (this.W != null) {
            class03529 = this.W.remove(var2);
            if (class03529 == null) {
               throw new AssertionError("Missing intrusive holder for " + var1 + ":" + var2);
            }

            class03529.y(var1);
         } else {
            class03529 = this.Z.computeIfAbsent(var1, var1x -> class03529.N_40(this, (class05946<T>)var1x));
         }

         this.Z.put(var1, class03529);
         this.B.put(var1.N(), class03529);
         this.z.put((T)var2, class03529);
         int ix = this.R.size();
         this.R.add(class03529);
         this.M.put(var2, ix);
         this.y.put(var1, var3);
         this.U = this.U.add(var3.y());
         this.N(var1, var2, var3, new CallbackInfoReturnable("", false, class03529));
         return class03529;
      }
   }

   @Nullable
   @Override
   public T N(@Nullable class01894 var1) {
      var1 = this.i(var1);
      return N(this.B.get(var1));
   }

   @Override
   public class00720<T> N(class01196<T> var1) {
      if (!this.u) {
         throw new IllegalStateException("Invalid method used for tag loading");
      } else {
         Builder builder = ImmutableMap.builder();
         HashMap hashmap = new HashMap();
         var1.y().forEach((var3x, var4x) -> {
            class03552 class03552 = this.E.get(var3x);
            if (class03552 == null) {
               class03552 = this.i((class03530<T>)var3x);
            }

            builder.put(var3x, class03552);
            hashmap.put(var3x, List.copyOf(var4x));
         });
         ImmutableMap immutablemap = builder.build();
         class00726 class00726 = new class00726(this, immutablemap);
         return new class00727<>(this, hashmap, class00726, immutablemap);
      }
   }

   @Override
   public void N(class03530<T> var1, List<class03556<T>> var2) {
      this.y();
      this.L(var1).y(var2);
   }

   @Nullable
   private static <T> T N(@Nullable class03529<T> var0) {
      return (T)(var0 != null ? var0.N() : null);
   }

   @Override
   public Optional<class03552<T>> N(class03530<T> var1) {
      return this.L.N(var1);
   }

   @Override
   public Optional<class03529<T>> N() {
      return this.R.isEmpty() ? Optional.empty() : Optional.of((class03529<T>)this.R.getFirst());
   }

   @Override
   public Optional<class03529<T>> N(class05946<T> var1) {
      var1 = this.W(var1);
      return Optional.ofNullable(this.Z.get(var1));
   }

   public void addAlias(class01894 var1, class01894 var2) {
      Objects.requireNonNull(var1, "alias cannot be null");
      Objects.requireNonNull(var2, "aliased id cannot be null");
      if (this.v.containsKey(var1)) {
         throw new IllegalArgumentException(
            "Tried adding %s as an alias for %s, but it is already an alias (for %s) in registry %s".formatted(var1, var2, this.v.get(var1), this.i)
         );
      } else if (this.B.containsKey(var1)) {
         throw new IllegalArgumentException("Tried adding %s as an alias, but it is already present in registry %s".formatted(var1, this.i));
      } else if (var1.equals(this.v.get(var2))) {
         throw new IllegalArgumentException(
            "Making %1$s an alias of %2$s would create a cycle, as %2$s is already an alias of %1$s (registry %3$s)".formatted(var1, var2, this.i)
         );
      } else {
         if (!this.B.containsKey(var2)) {
            P.warn("Adding {} as an alias for {}, but the latter doesn't exist in registry {}", new Object[]{var1, var2, this.i});
         }

         this.y();
         class01894 class01894 = this.v.getOrDefault(var2, var2);

         for (Entry entry : this.v.entrySet()) {
            if (var1.equals(entry.getValue())) {
               entry.setValue(class01894);
            }
         }

         this.v.put(var1, class01894);
         P.debug("Adding alias {} for {} in registry {}", new Object[]{var1, var2, this.i});
      }
   }

   @Override
   public class00751<T> W() {
      if (this.u) {
         return this;
      } else {
         this.u = true;
         this.z.forEach((var0, var1x) -> var1x.y((T)var0));
         List list = this.Z.entrySet().stream().filter(var0 -> !var0.getValue().y()).map(var0 -> ((class05946)var0.getKey()).N()).sorted().toList();
         if (!list.isEmpty()) {
            throw new IllegalStateException("Unbound values in registry " + this.i() + ": " + list);
         } else {
            if (this.W != null) {
               if (!this.W.isEmpty()) {
                  throw new IllegalStateException("Some intrusive holders were not registered: " + this.W.values());
               }

               this.W = null;
            }

            if (this.L.y()) {
               throw new IllegalStateException("Tags already present before freezing");
            } else {
               List list1 = this.E.entrySet().stream().filter(var0 -> !var0.getValue().L()).map(var0 -> ((class03530)var0.getKey()).y()).sorted().toList();
               if (!list1.isEmpty()) {
                  throw new IllegalStateException("Unbound tags in registry " + this.i() + ": " + list1);
               } else {
                  this.L = class00752.N(this.E);
                  this.m();
                  return this;
               }
            }
         }
      }
   }

   private class05946 W(class05946 var1) {
      if (var1 == null) {
         return null;
      } else {
         class01894 class01894 = (class01894)this.v.get(var1.N());
         return class01894 == null ? var1 : class05946.N(var1.L(), class01894);
      }
   }

   @Override
   public boolean R(class05946<T> var1) {
      var1 = this.W(var1);
      return this.Z.containsKey(var1);
   }

   @Override
   public class03529<T> R(T var1) {
      if (this.W == null) {
         throw new IllegalStateException("This registry can't create intrusive holders");
      } else {
         this.y();
         return this.W.computeIfAbsent((T)var1, var1x -> class03529.N(this, (T)var1x));
      }
   }

   @Override
   public Lifecycle R() {
      return this.U;
   }

   public void unmap() throws RemapException {
      if (this.b != null) {
         ArrayList arraylist = new ArrayList();

         for (class01894 class01894x : this.j.keySet()) {
            if (!this.B.containsKey(class01894x)) {
               if (!this.b.containsKey(class01894x)) {
                  throw new IllegalStateException("id missing from previous indexed entries");
               }

               arraylist.add(class01894x);
            }
         }

         this.B.clear();
         this.Z.clear();
         this.B.putAll(this.j);

         for (Entry entry : this.j.entrySet()) {
            class05946 class05946 = class05946.N(this.i(), (class01894)entry.getKey());
            this.Z.put(class05946, (class03529<T>)entry.getValue());
         }

         this.remap(this.b, RemapMode.AUTHORITATIVE);

         for (class01894 class01894x : arraylist) {
            ((RegistryEntryAddedCallback)this.fabric_getAddObjectEvent().invoker())
               .onEntryAdded(this.M.getInt(this.B.get(class01894x)), class01894x, this.N(class01894x));
         }

         this.b = null;
         this.j = null;
      }
   }

   public void remap(Object2IntMap var1, RemapMode var2) throws RemapException {
      switch (var2) {
         case REMOTE:
            ArrayList arraylist = null;
            ObjectIterator objectiterator = var1.keySet().iterator();

            while (objectiterator.hasNext()) {
               class01894 class01894xxx = (class01894)objectiterator.next();
               if (!this.u(class01894xxx)) {
                  if (arraylist == null) {
                     arraylist = new ArrayList();
                  }

                  arraylist.add(" - " + class01894xxx);
               }
            }

            if (arraylist != null) {
               StringBuilder stringbuilder = new StringBuilder("Received ID map for " + this.i() + " contains IDs unknown to the receiver!");

               for (String sx : arraylist) {
                  stringbuilder.append('\n').append(sx);
               }

               throw new RemapException(stringbuilder.toString());
            }
         case AUTHORITATIVE:
         default:
            if (this.b == null) {
               this.b = new Object2IntOpenHashMap();
               this.j = HashBiMap.create(this.B);

               for (Object object : this) {
                  this.b.put(this.y((T)object), this.N((T)object));
               }
            }

            Int2ObjectOpenHashMap int2objectopenhashmap = new Int2ObjectOpenHashMap();

            for (Object object1 : this) {
               int2objectopenhashmap.put(this.N((T)object1), this.y((T)object1));
            }

            switch (var2) {
               case AUTHORITATIVE:
                  int k = 0;
                  Object object2 = var1;
                  var1 = new Object2IntOpenHashMap();
                  ObjectIterator objectiterator1 = object2.keySet().iterator();

                  while (objectiterator1.hasNext()) {
                     class01894 class01894x = (class01894)objectiterator1.next();
                     int ix = object2.getInt(class01894x);
                     var1.put(class01894x, ix);
                     if (ix > k) {
                        k = ix;
                     }
                  }

                  for (class01894 class01894x : this.M()) {
                     if (!var1.containsKey(class01894x)) {
                        P.warn("Adding " + class01894x + " to saved/remote registry.");
                        var1.put(class01894x, ++k);
                     }
                  }
                  break;
               case REMOTE:
                  int jx = -1;

                  for (class01894 class01894xxxxx : this.M()) {
                     if (!var1.containsKey(class01894xxxxx)) {
                        if (jx < 0) {
                           jx = var1.values().intStream().max().orElseThrow(() -> new RemapException("Failed to assign new id to client only registry entry"));
                        }

                        P.debug(
                           "An ID for {} was not sent by the server, assuming client only registry entry and assigning a new id ({}) in {}",
                           new Object[]{class01894xxxxx.toString(), ++jx, this.i().N().toString()}
                        );
                        var1.put(class01894xxxxx, jx);
                     }
                  }
            }

            Int2IntOpenHashMap int2intopenhashmap = new Int2IntOpenHashMap();

            for (int l = 0; l < this.R.size(); l++) {
               class03529 class03529x = (class03529)this.R.get(l);
               if (class03529x == null) {
                  throw new RemapException("Unused id " + l + " in registry " + this.i().N());
               }

               class01894 class01894xx = class03529x.B().N();
               if (var1.containsKey(class01894xx)) {
                  int2intopenhashmap.put(l, var1.getInt(class01894xx));
               }
            }

            this.R.clear();
            this.M.clear();
            ArrayList arraylist1 = new ArrayList(var1.keySet());
            arraylist1.sort(Comparator.comparingInt(var1::getInt));

            for (class01894 class01894xx : arraylist1) {
               int i1 = var1.getInt(class01894xx);
               class03529 class03529x = this.B.get(class01894xx);
               if (class03529x == null) {
                  if (var2 != RemapMode.AUTHORITATIVE) {
                     throw new RemapException(class01894xx + " missing from registry, but requested!");
                  }

                  P.warn(class01894xx + " missing from registry, but requested!");
               } else {
                  this.R.size(Math.max(this.R.size(), i1 + 1));
                  if (this.R.get(i1) != null) {
                     throw new IllegalStateException("Raw ID already populated");
                  }

                  this.R.set(i1, class03529x);
                  this.M.put(class03529x.N(), i1);
               }
            }

            ((RegistryIdRemapCallback)this.fabric_getRemapEvent().invoker()).onRemap(new RemapStateImpl(this, int2objectopenhashmap, int2intopenhashmap));
      }
   }

   public void fabric_applyPendingTagAliases() {
      if (this.t != null) {
         Set set = Sets.newIdentityHashSet();
         set.addAll(this.t.values());

         for (Set set1 : set) {
            Set set2 = Sets.newIdentityHashSet();

            for (class03530 class03530x : set1) {
               class03552 class03552x = this.L.N(class03530x).orElse(null);
               if (class03552x != null) {
                  set2.addAll(class03552x.N);
               } else {
                  n.info("[Fabric] Creating a new empty tag {} for unknown tag used in a tag alias group in {}", class03530x.y(), class03530x.N().N());
                  Object object = ((SimpleRegistryTagLookup2Accessor)this.L).fabric_getTagMap();
                  if (!(object instanceof HashMap)) {
                     object = new HashMap((Map)object);
                     ((SimpleRegistryTagLookup2Accessor)this.L).fabric_setTagMap((Map)object);
                  }

                  object.put(class03530x, this.i(class03530x));
               }
            }

            List list = List.copyOf(set2);

            for (class03530 class03530x : set1) {
               class03552 class03552 = this.L.N(class03530x).orElseThrow();
               class03552.N = list;
            }
         }

         n.debug("[Fabric] Loaded {} tag alias groups for {}", set.size(), this.i.N());
         this.t = null;
      }
   }

   public Event fabric_getRemapEvent() {
      return this.T;
   }

   public Event fabric_getAddObjectEvent() {
      return this.s;
   }

   public void fabric_loadTagAliases(Map var1) {
      this.t = var1;
   }
}
