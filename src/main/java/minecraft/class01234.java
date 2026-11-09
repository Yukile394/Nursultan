package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import net.caffeinemc.mods.lithium.common.entity.EntityClassGroup;
import net.caffeinemc.mods.lithium.common.entity.TypeFilterableListInternalAccess;
import net.caffeinemc.mods.lithium.common.world.chunk.ClassGroupFilterableList;
import net.caffeinemc.mods.lithium.mixin.alloc.entity_iteration.ClassInstanceMultiMapAccessor;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01234<T> extends AbstractCollection<T> implements TypeFilterableListInternalAccess, ClassGroupFilterableList, ClassInstanceMultiMapAccessor {
   private Map<Class<?>, List<T>> N;
   private final Class<T> y;
   private final List<T> L;
   private final Reference2ReferenceArrayMap u = new Reference2ReferenceArrayMap();

   private Collection L(Class var1) {
      ArrayList arraylist = new ArrayList();

      for (Object object : this.L) {
         if (var1.isInstance(object)) {
            arraylist.add(object);
         }
      }

      this.N.put(var1, arraylist);
      return arraylist;
   }

   public class01234(Class<T> var1) {
      super();
      this.N = Maps.newHashMap();
      this.L = Lists.newArrayList();
      this.y = var1;
      this.N.put(var1, this.L);
      this.N(var1, null);
   }

   @Override
   public boolean remove(Object var1) {
      var1 = this.y(var1);
      boolean flag = false;

      for (Entry entry : this.N.entrySet()) {
         if (((Class)entry.getKey()).isInstance(var1)) {
            List list = (List)entry.getValue();
            flag |= list.remove(var1);
         }
      }

      return flag;
   }

   @Override
   public int size() {
      return this.L.size();
   }

   @Override
   public boolean add(T var1) {
      var1 = this.N(var1);
      boolean flag = false;

      for (Entry entry : this.N.entrySet()) {
         if (((Class)entry.getKey()).isInstance(var1)) {
            flag |= ((List)entry.getValue()).add(var1);
         }
      }

      return flag;
   }

   @Override
   public Iterator<T> iterator() {
      return (Iterator<T>)(this.L.isEmpty() ? Collections.emptyIterator() : Iterators.unmodifiableIterator(this.L.iterator()));
   }

   @Override
   public boolean contains(Object var1) {
      return this.N(var1.getClass()).contains(var1);
   }

   public Object y(Object var1) {
      ObjectIterator objectiterator = this.u.values().iterator();

      while (objectiterator.hasNext()) {
         ((ReferenceLinkedOpenHashSet)objectiterator.next()).remove(var1);
      }

      return var1;
   }

   public Object N(Object var1) {
      ObjectIterator objectiterator = this.u.entrySet().iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         if (((EntityClassGroup)entry.getKey()).contains((class07049)var1)) {
            ((ReferenceLinkedOpenHashSet)entry.getValue()).add(var1);
         }
      }

      return var1;
   }

   public Collection N(Class var1) {
      Collection collection = this.N.get(var1);
      if (collection == null) {
         collection = this.L(var1);
      }

      return Collections.unmodifiableCollection(collection);
   }

   private void N(Class var1, CallbackInfo var2) {
      this.N = new Reference2ReferenceOpenHashMap(this.N);
   }

   private Collection N(EntityClassGroup var1) {
      ReferenceLinkedOpenHashSet referencelinkedopenhashset = new ReferenceLinkedOpenHashSet();

      for (Object object : this.L) {
         if (var1.contains((class07049)object)) {
            referencelinkedopenhashset.add(object);
         }
      }

      this.u.put(var1, referencelinkedopenhashset);
      return referencelinkedopenhashset;
   }

   private boolean N(Class var1, Class var2) {
      return true;
   }

   public List<T> N() {
      return ImmutableList.copyOf(this.L);
   }

   public List lithium$getOrCreateAllOfTypeRaw(Class var1) {
      List list = this.N.get(var1);
      if (list == null) {
         this.N(var1);
         list = this.N.get(var1);
      }

      return list;
   }

   public List lithium$replaceCollectionAndGet(Class var1, ArrayList var2) {
      this.N.put(var1, var2);
      return var2;
   }

   public List lithium$replaceCollectionAndGet(Class var1, Function var2) {
      List list = this.N.get(var1);
      List list1 = (List)var2.apply((ArrayList)list);
      this.N.put(var1, list1);
      return list1;
   }

   public Collection lithium$getAllOfGroupType(EntityClassGroup var1) {
      Collection collection = (Collection)this.u.get(var1);
      if (collection == null) {
         collection = this.N(var1);
      }

      return collection;
   }
}
