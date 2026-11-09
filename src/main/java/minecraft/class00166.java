package minecraft;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.ListBuilder;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class class00166 implements DynamicOps<HashCode> {
   private static final byte R = 1;
   private static final byte M = 2;
   private static final byte B = 3;
   private static final byte Z = 4;
   private static final byte z = 5;
   private static final byte U = 6;
   private static final byte E = 7;
   private static final byte W = 8;
   private static final byte m = 9;
   private static final byte P = 10;
   private static final byte s = 11;
   private static final byte T = 12;
   private static final byte b = 13;
   private static final byte j = 14;
   private static final byte v = 15;
   private static final byte n = 16;
   private static final byte t = 17;
   private static final byte G = 18;
   private static final byte l = 19;
   private static final byte[] d = new byte[]{1};
   private static final byte[] w = new byte[]{13, 0};
   private static final byte[] k = new byte[]{13, 1};
   public static final byte[] N = new byte[]{2, 3};
   public static final byte[] y = new byte[]{4, 5};
   private static final DataResult<Object> Y = DataResult.error(() -> "Unsupported operation");
   private static final Comparator<HashCode> Q = Comparator.comparingLong(HashCode::padToLong);
   private static final Comparator<Entry<HashCode, HashCode>> O = Entry.<HashCode, HashCode>comparingByKey(Q).thenComparing(Entry.comparingByValue(Q));
   private static final Comparator<Pair<HashCode, HashCode>> g = Comparator.<Pair<HashCode, HashCode>, HashCode>comparing(Pair::getFirst, Q)
      .thenComparing(Pair::getSecond, Q);
   public static final class00166 L = new class00166(Hashing.crc32c());
   final HashFunction u;
   final HashCode i;
   private final HashCode I;
   private final HashCode J;
   private final HashCode o;
   private final HashCode q;

   public DataResult<String> getStringValue(HashCode var1) {
      return u();
   }

   public HashCode emptyList() {
      return this.J;
   }

   public DataResult<Stream<HashCode>> getStream(HashCode var1) {
      return u();
   }

   public class00166(HashFunction var1) {
      super();
      this.u = var1;
      this.i = var1.hashBytes(d);
      this.I = var1.hashBytes(N);
      this.J = var1.hashBytes(y);
      this.q = var1.hashBytes(w);
      this.o = var1.hashBytes(k);
   }

   @Override
   public String toString() {
      return "Hash " + this.u;
   }

   public DataResult<Consumer<Consumer<HashCode>>> getList(HashCode var1) {
      return u();
   }

   public DataResult<MapLike<HashCode>> getMap(HashCode var1) {
      return u();
   }

   public DataResult<Stream<Pair<HashCode, HashCode>>> getMapValues(HashCode var1) {
      return u();
   }

   public DataResult<IntStream> getIntStream(HashCode var1) {
      return u();
   }

   public DataResult<ByteBuffer> getByteBuffer(HashCode var1) {
      return u();
   }

   boolean u(HashCode var1) {
      return var1.equals(this.i);
   }

   private static <T> DataResult<T> u() {
      return (DataResult<T>)Y;
   }

   public HashCode emptyMap() {
      return this.I;
   }

   public DataResult<HashCode> get(HashCode var1, String var2) {
      return u();
   }

   public DataResult<Boolean> getBooleanValue(HashCode var1) {
      return u();
   }

   public DataResult<HashCode> mergeToList(HashCode var1, HashCode var2) {
      return this.u(var1) ? DataResult.success(this.createList(Stream.of(var2))) : u();
   }

   public HashCode createList(Stream<HashCode> var1) {
      Hasher hasher = this.u.newHasher();
      hasher.putByte((byte)4);
      var1.forEach(var1x -> hasher.putBytes(var1x.asBytes()));
      hasher.putByte((byte)5);
      return hasher.hash();
   }

   public DataResult<LongStream> getLongStream(HashCode var1) {
      return u();
   }

   public HashCode empty() {
      return this.i;
   }

   public HashCode createBoolean(boolean var1) {
      return var1 ? this.o : this.q;
   }

   public HashCode createString(String var1) {
      return this.u.newHasher().putByte((byte)12).putInt(var1.length()).putUnencodedChars(var1).hash();
   }

   static Hasher N(Hasher var0, Stream<Pair<HashCode, HashCode>> var1) {
      var0.putByte((byte)2);
      var1.sorted(g).forEach(var1x -> var0.putBytes(((HashCode)var1x.getFirst()).asBytes()).putBytes(((HashCode)var1x.getSecond()).asBytes()));
      var0.putByte((byte)3);
      return var0;
   }

   private static Hasher N(Hasher var0, Map<HashCode, HashCode> var1) {
      var0.putByte((byte)2);
      var1.entrySet().stream().sorted(O).forEach(var1x -> var0.putBytes(var1x.getKey().asBytes()).putBytes(var1x.getValue().asBytes()));
      var0.putByte((byte)3);
      return var0;
   }

   public HashCode createShort(short var1) {
      return this.u.newHasher(3).putByte((byte)7).putShort(var1).hash();
   }

   public HashCode createDouble(double var1) {
      return this.u.newHasher(9).putByte((byte)11).putDouble(var1).hash();
   }

   public HashCode createFloat(float var1) {
      return this.u.newHasher(5).putByte((byte)10).putFloat(var1).hash();
   }

   public HashCode createInt(int var1) {
      return this.u.newHasher(5).putByte((byte)8).putInt(var1).hash();
   }

   public HashCode createByte(byte var1) {
      return this.u.newHasher(2).putByte((byte)6).putByte(var1).hash();
   }

   public HashCode createLong(long var1) {
      return this.u.newHasher(9).putByte((byte)9).putLong(var1).hash();
   }

   public HashCode remove(HashCode var1, String var2) {
      return var1;
   }

   public HashCode updateGeneric(HashCode var1, HashCode var2, Function<HashCode, HashCode> var3) {
      return var1;
   }

   public HashCode createLongList(LongStream var1) {
      Hasher hasher = this.u.newHasher();
      hasher.putByte((byte)18);
      var1.forEach(hasher::putLong);
      hasher.putByte((byte)19);
      return hasher.hash();
   }

   public HashCode set(HashCode var1, String var2, HashCode var3) {
      return var1;
   }

   public DataResult<Number> getNumberValue(HashCode var1) {
      return u();
   }

   public Number getNumberValue(HashCode var1, Number var2) {
      return var2;
   }

   public <U> U convertTo(DynamicOps<U> var1, HashCode var2) {
      throw new UnsupportedOperationException("Can't convert from this type");
   }

   public HashCode update(HashCode var1, String var2, Function<HashCode, HashCode> var3) {
      return var1;
   }

   public HashCode createMap(Map<HashCode, HashCode> var1) {
      return N(this.u.newHasher(), var1).hash();
   }

   public DataResult<HashCode> mergeToMap(HashCode var1, HashCode var2, HashCode var3) {
      return this.u(var1) ? DataResult.success(this.createMap(Map.of(var2, var3))) : u();
   }

   public DataResult<HashCode> mergeToMap(HashCode var1, Map<HashCode, HashCode> var2) {
      return this.u(var1) ? DataResult.success(this.createMap(var2)) : u();
   }

   public DataResult<HashCode> getGeneric(HashCode var1, HashCode var2) {
      return u();
   }

   public DataResult<HashCode> mergeToMap(HashCode var1, MapLike<HashCode> var2) {
      return this.u(var1) ? DataResult.success(this.createMap(var2.entries())) : u();
   }

   public HashCode createMap(Stream<Pair<HashCode, HashCode>> var1) {
      return N(this.u.newHasher(), var1).hash();
   }

   public HashCode createIntList(IntStream var1) {
      Hasher hasher = this.u.newHasher();
      hasher.putByte((byte)16);
      var1.forEach(hasher::putInt);
      hasher.putByte((byte)17);
      return hasher.hash();
   }

   public HashCode createNumeric(Number var1) {
      return switch (var1) {
         case Byte obyte -> this.createByte(obyte);
         case Short oshort -> this.createShort(oshort);
         case Integer integer -> this.createInt(integer);
         case Long olong -> this.createLong(olong);
         case Double d0 -> this.createDouble(d0);
         case Float f -> this.createFloat(f);
         default -> this.createDouble(var1.doubleValue());
      };
   }

   public DataResult<HashCode> mergeToList(HashCode var1, List<HashCode> var2) {
      return this.u(var1) ? DataResult.success(this.createList(var2.stream())) : u();
   }

   public HashCode createByteList(ByteBuffer var1) {
      Hasher hasher = this.u.newHasher();
      hasher.putByte((byte)14);
      hasher.putBytes(var1);
      hasher.putByte((byte)15);
      return hasher.hash();
   }

   public DataResult<Consumer<BiConsumer<HashCode, HashCode>>> getMapEntries(HashCode var1) {
      return u();
   }

   public RecordBuilder<HashCode> mapBuilder() {
      return new class00172(this);
   }

   public ListBuilder<HashCode> listBuilder() {
      return new class00184(this);
   }
}
