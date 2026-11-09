package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import io.netty.util.ByteProcessor;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.security.PublicKey;
import java.time.Instant;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class00667 extends ByteBuf {
   private final ByteBuf L;
   public static final short N = 32767;
   public static final int y = 262144;
   private static final int u = 256;
   private static final int i = 256;
   private static final int R = 512;
   private static final Gson M = new Gson();

   public class00667 resetReaderIndex() {
      this.L.resetReaderIndex();
      return this;
   }

   public ByteBuf unwrap() {
      return this.L;
   }

   public class00667 setShort(int var1, int var2) {
      this.L.setShort(var1, var2);
      return this;
   }

   public static class07209 L(ByteBuf var0) {
      return class07209.method_10092(var0.readLong());
   }

   @Nullable
   public <T> T L(class02895<? super class00667, T> var1) {
      return N(this, var1);
   }

   public static long[] L(ByteBuf var0, long[] var1) {
      for (int ix = 0; ix < var1.length; ix++) {
         var1[ix] = var0.readLong();
      }

      return var1;
   }

   public class00667 writeBytes(byte[] var1) {
      this.L.writeBytes(var1);
      return this;
   }

   public class00667 writeLongLE(long var1) {
      this.L.writeLongLE(var1);
      return this;
   }

   public class00667 readBytes(ByteBuf var1, int var2) {
      this.L.readBytes(var1, var2);
      return this;
   }

   public int[] L() {
      return this.y(this.readableBytes());
   }

   public class00667 L(int var1) {
      class01657.N(this.L, var1);
      return this;
   }

   public long[] L(long[] var1) {
      return L(this, var1);
   }

   public class00667 setInt(int var1, int var2) {
      this.L.setInt(var1, var2);
      return this;
   }

   public class00667 capacity(int var1) {
      this.L.capacity(var1);
      return this;
   }

   public static class06889 M(ByteBuf var0) {
      return new class06889(var0.readDouble(), var0.readDouble(), var0.readDouble());
   }

   public class06289 M() {
      class05946 class05946 = this.N(class04227.yg);
      class07209 class07209 = this.i();
      return class06289.N(class05946, class07209);
   }

   public class00667 writeMedium(int var1) {
      this.L.writeMedium(var1);
      return this;
   }

   @Nullable
   public class07001 P() {
      return Z(this);
   }

   public class01894 T() {
      return class01894.N(this.u(32767));
   }

   public class00667 writeInt(int var1) {
      this.L.writeInt(var1);
      return this;
   }

   public class00667 discardReadBytes() {
      this.L.discardReadBytes();
      return this;
   }

   public class00667(ByteBuf var1) {
      super();
      this.L = var1;
   }

   public boolean equals(Object var1) {
      return this.L.equals(var1);
   }

   public String toString(Charset var1) {
      return this.L.toString(var1);
   }

   public String toString() {
      return this.L.toString();
   }

   public String toString(int var1, int var2, Charset var3) {
      return this.L.toString(var1, var2, var3);
   }

   public int hashCode() {
      return this.L.hashCode();
   }

   public int compareTo(ByteBuf var1) {
      return this.L.compareTo(var1);
   }

   public int indexOf(int var1, int var2, byte var3) {
      return this.L.indexOf(var1, var2, var3);
   }

   public boolean getBoolean(int var1) {
      return this.L.getBoolean(var1);
   }

   public byte getByte(int var1) {
      return this.L.getByte(var1);
   }

   public short getShort(int var1) {
      return this.L.getShort(var1);
   }

   public char getChar(int var1) {
      return this.L.getChar(var1);
   }

   public int getInt(int var1) {
      return this.L.getInt(var1);
   }

   public long getLong(int var1) {
      return this.L.getLong(var1);
   }

   public float getFloat(int var1) {
      return this.L.getFloat(var1);
   }

   public double getDouble(int var1) {
      return this.L.getDouble(var1);
   }

   public class00667 setIntLE(int var1, int var2) {
      this.L.setIntLE(var1, var2);
      return this;
   }

   public class00667 readerIndex(int var1) {
      this.L.readerIndex(var1);
      return this;
   }

   public Vector3f B() {
      return i(this);
   }

   public static UUID B(ByteBuf var0) {
      return new UUID(var0.readLong(), var0.readLong());
   }

   public class00667 I() {
      this.L.touch();
      return this;
   }

   public class00667 setChar(int var1, int var2) {
      this.L.setChar(var1, var2);
      return this;
   }

   @Nullable
   public static class07001 Z(ByteBuf var0) {
      class07709 class07709 = N(var0, class07726.N());
      if (class07709 != null && !(class07709 instanceof class07001)) {
         throw new DecoderException("Not a compound tag: " + class07709);
      } else {
         return (class07001)class07709;
      }
   }

   public Quaternionf Z() {
      return R(this);
   }

   public class00667 writerIndex(int var1) {
      this.L.writerIndex(var1);
      return this;
   }

   public int getBytes(int var1, GatheringByteChannel var2, int var3) throws IOException {
      return this.L.getBytes(var1, var2, var3);
   }

   public int getBytes(int var1, FileChannel var2, long var3, int var5) throws IOException {
      return this.L.getBytes(var1, var2, var3, var5);
   }

   public BitSet i(int var1) {
      byte[] abyte = new byte[class04995.R(var1, 8)];
      this.readBytes(abyte);
      return BitSet.valueOf(abyte);
   }

   public class00667 setMedium(int var1, int var2) {
      this.L.setMedium(var1, var2);
      return this;
   }

   public class07209 i() {
      return L(this);
   }

   public static Vector3f i(ByteBuf var0) {
      return new Vector3f(var0.readFloat(), var0.readFloat(), var0.readFloat());
   }

   public class00667 writeIntLE(int var1) {
      this.L.writeIntLE(var1);
      return this;
   }

   public <T> class05946<? extends class00751<T>> b() {
      return class05946.N(this.T());
   }

   public String s() {
      return this.u(32767);
   }

   public class00667 writeMediumLE(int var1) {
      this.L.writeMediumLE(var1);
      return this;
   }

   public class06183 n() {
      class07209 class07209 = this.i();
      class07211 class07211 = this.y(class07211.class);
      float f = this.readFloat();
      float f1 = this.readFloat();
      float f2 = this.readFloat();
      boolean flag = this.readBoolean();
      boolean flag1 = this.readBoolean();
      return new class06183(
         new class06889((double)class07209.method_10263() + f, (double)class07209.method_10264() + f1, (double)class07209.method_10260() + f2),
         class07211,
         class07209,
         flag,
         flag1
      );
   }

   public class00667 n(int var1) {
      this.L.retain(var1);
      return this;
   }

   public class00667 clear() {
      this.L.clear();
      return this;
   }

   public class00667 markReaderIndex() {
      this.L.markReaderIndex();
      return this;
   }

   public class00667 writeShortLE(int var1) {
      this.L.writeShortLE(var1);
      return this;
   }

   public UUID m() {
      return B(this);
   }

   public boolean isDirect() {
      return this.L.isDirect();
   }

   public boolean hasArray() {
      return this.L.hasArray();
   }

   public byte[] array() {
      return this.L.array();
   }

   public int arrayOffset() {
      return this.L.arrayOffset();
   }

   public class00667 markWriterIndex() {
      this.L.markWriterIndex();
      return this;
   }

   private int t(int var1) {
      return Math.min(var1, 65536);
   }

   public BitSet t() {
      return BitSet.valueOf(this.u());
   }

   public class00667 g() {
      this.L.retain();
      return this;
   }

   public class00667 writeZero(int var1) {
      this.L.writeZero(var1);
      return this;
   }

   public PublicKey v() {
      try {
         return class01222.N(this.N(512));
      } catch (class05449 class05449) {
         throw new DecoderException("Malformed public key bytes", class05449);
      }
   }

   public Instant j() {
      return Instant.ofEpochMilli(this.readLong());
   }

   public class00667 writeChar(int var1) {
      this.L.writeChar(var1);
      return this;
   }

   public class00667 skipBytes(int var1) {
      this.L.skipBytes(var1);
      return this;
   }

   public class00667 readBytes(ByteBuf var1) {
      this.L.readBytes(var1);
      return this;
   }

   public class06889 U() {
      return class00928.N(this);
   }

   public int readInt() {
      return this.L.readInt();
   }

   public ByteBuf copy(int var1, int var2) {
      return this.L.copy(var1, var2);
   }

   public ByteBuf copy() {
      return this.L.copy();
   }

   public class06889 z() {
      return M(this);
   }

   public static int z(ByteBuf var0) {
      return class01657.N(var0);
   }

   public class00667 ensureWritable(int var1) {
      this.L.ensureWritable(var1);
      return this;
   }

   public class00667 setZero(int var1, int var2) {
      this.L.setZero(var1, var2);
      return this;
   }

   public int capacity() {
      return this.L.capacity();
   }

   public boolean isReadOnly() {
      return this.L.isReadOnly();
   }

   public ByteBuf slice(int var1, int var2) {
      return this.L.slice(var1, var2);
   }

   public ByteBuf slice() {
      return this.L.slice();
   }

   public ByteBuf duplicate() {
      return this.L.duplicate();
   }

   public boolean release(int var1) {
      return this.L.release(var1);
   }

   public boolean release() {
      return this.L.release();
   }

   public class00667 writeBytes(ByteBuf var1, int var2) {
      this.L.writeBytes(var1, var2);
      return this;
   }

   public class00667 setShortLE(int var1, int var2) {
      this.L.setShortLE(var1, var2);
      return this;
   }

   public static class07321 u(ByteBuf var0) {
      return new class07321(var0.readLong());
   }

   public long[] u() {
      return y(this);
   }

   public String u(int var1) {
      return class01663.N(this.L, var1);
   }

   public <L, R> Either<L, R> y(class02895<? super class00667, L> var1, class02895<? super class00667, R> var2) {
      return this.readBoolean() ? Either.left(var1.decode(this)) : Either.right(var2.decode(this));
   }

   public class00667 writeLong(long var1) {
      this.L.writeLong(var1);
      return this;
   }

   public <T> Optional<T> y(class02895<? super class00667, T> var1) {
      return this.readBoolean() ? Optional.of((T)var1.decode(this)) : Optional.empty();
   }

   public byte[] y() {
      return N((ByteBuf)this);
   }

   public class00667 setBytes(int var1, byte[] var2, int var3, int var4) {
      this.L.setBytes(var1, var2, var3, var4);
      return this;
   }

   public class00667 setBytes(int var1, byte[] var2) {
      this.L.setBytes(var1, var2);
      return this;
   }

   public class00667 readBytes(byte[] var1) {
      this.L.readBytes(var1);
      return this;
   }

   public class00667 setBytes(int var1, ByteBuf var2, int var3, int var4) {
      this.L.setBytes(var1, var2, var3, var4);
      return this;
   }

   public class00667 setBytes(int var1, ByteBuf var2, int var3) {
      this.L.setBytes(var1, var2, var3);
      return this;
   }

   public class00667 setBytes(int var1, ByteBuffer var2) {
      this.L.setBytes(var1, var2);
      return this;
   }

   public class00667 setBytes(int var1, ByteBuf var2) {
      this.L.setBytes(var1, var2);
      return this;
   }

   public class00667 writeBytes(ByteBuffer var1) {
      this.L.writeBytes(var1);
      return this;
   }

   public void y(class06889 var1) {
      class00928.N(this, var1);
   }

   public class00667 writeBytes(ByteBuf var1, int var2, int var3) {
      this.L.writeBytes(var1, var2, var3);
      return this;
   }

   public class00667 setLongLE(int var1, long var2) {
      this.L.setLongLE(var1, var2);
      return this;
   }

   public static void y(ByteBuf var0, int var1) {
      class01657.N(var0, var1);
   }

   public <T extends Enum<T>> T y(Class<T> var1) {
      return (T)var1.getEnumConstants()[this.E()];
   }

   public class00667 writeBytes(byte[] var1, int var2, int var3) {
      this.L.writeBytes(var1, var2, var3);
      return this;
   }

   public static long[] y(ByteBuf var0) {
      int ix = class01657.N(var0);
      int j = var0.readableBytes() / 8;
      if (ix > j) {
         throw new DecoderException("LongArray with size " + ix + " is bigger than allowed " + j);
      } else {
         return L(var0, new long[ix]);
      }
   }

   public int[] y(int var1) {
      int ix = this.E();
      if (ix > var1) {
         throw new DecoderException("VarIntArray with size " + ix + " is bigger than allowed " + var1);
      } else {
         int[] aint = new int[ix];

         for (int j = 0; j < aint.length; j++) {
            aint[j] = this.E();
         }

         return aint;
      }
   }

   public class00667 y(long[] var1) {
      y(this, var1);
      return this;
   }

   public void y(class05946<?> var1) {
      this.N(var1.N());
   }

   public class00667 setByte(int var1, int var2) {
      this.L.setByte(var1, var2);
      return this;
   }

   public static void y(ByteBuf var0, long[] var1) {
      for (long ix : var1) {
         var0.writeLong(ix);
      }
   }

   public class00667 writeBytes(ByteBuf var1) {
      this.L.writeBytes(var1);
      return this;
   }

   public int E() {
      return class01657.N(this.L);
   }

   public class00667 writeByte(int var1) {
      this.L.writeByte(var1);
      return this;
   }

   public int readBytes(FileChannel var1, long var2, int var4) throws IOException {
      return this.L.readBytes(var1, var2, var4);
   }

   public ByteBuf readBytes(int var1) {
      return this.L.readBytes(var1);
   }

   public int readBytes(GatheringByteChannel var1, int var2) throws IOException {
      return this.L.readBytes(var1, var2);
   }

   public int writeBytes(InputStream var1, int var2) throws IOException {
      return this.L.writeBytes(var1, var2);
   }

   public int writeBytes(ScatteringByteChannel var1, int var2) throws IOException {
      return this.L.writeBytes(var1, var2);
   }

   public int writeBytes(FileChannel var1, long var2, int var4) throws IOException {
      return this.L.writeBytes(var1, var2, var4);
   }

   public ByteBuf order(ByteOrder var1) {
      return this.L.order(var1);
   }

   public ByteOrder order() {
      return this.L.order();
   }

   public String readString(int var1, Charset var2) {
      return this.L.readString(var1, var2);
   }

   public boolean isReadable(int var1) {
      return this.L.isReadable(var1);
   }

   public boolean isReadable() {
      return this.L.isReadable();
   }

   public boolean isWritable() {
      return this.L.isWritable();
   }

   public boolean isWritable(int var1) {
      return this.L.isWritable(var1);
   }

   public char readChar() {
      return this.L.readChar();
   }

   public float readFloat() {
      return this.L.readFloat();
   }

   public int getUnsignedShort(int var1) {
      return this.L.getUnsignedShort(var1);
   }

   public class00667 writeFloat(float var1) {
      this.L.writeFloat(var1);
      return this;
   }

   public class00667 N(@Nullable class07709 var1) {
      N(this, var1);
      return this;
   }

   public class00667 writeBoolean(boolean var1) {
      this.L.writeBoolean(var1);
      return this;
   }

   public byte[] N(int var1) {
      return N(this, var1);
   }

   public static void N(ByteBuf var0, byte[] var1) {
      class01657.N(var0, var1.length);
      var0.writeBytes(var1);
   }

   public class00667 readBytes(byte[] var1, int var2, int var3) {
      this.L.readBytes(var1, var2, var3);
      return this;
   }

   public class00667 readBytes(ByteBuffer var1) {
      this.L.readBytes(var1);
      return this;
   }

   public class00667 readBytes(OutputStream var1, int var2) throws IOException {
      this.L.readBytes(var1, var2);
      return this;
   }

   @Deprecated
   public <T> T N(DynamicOps<class07709> var1, Codec<T> var2) {
      return this.N(var1, var2, class07726.L());
   }

   public static byte[] N(ByteBuf var0, int var1) {
      int ix = class01657.N(var0);
      if (ix > var1) {
         throw new DecoderException("ByteArray with size " + ix + " is bigger than allowed " + var1);
      } else {
         byte[] abyte = new byte[ix];
         var0.readBytes(abyte);
         return abyte;
      }
   }

   public static <T, B extends ByteBuf> void N(B var0, @Nullable T var1, class02874<? super B, T> var2) {
      if (var1 != null) {
         var0.writeBoolean(true);
         var2.encode(var0, var1);
      } else {
         var0.writeBoolean(false);
      }
   }

   public class00667 readBytes(ByteBuf var1, int var2, int var3) {
      this.L.readBytes(var1, var2, var3);
      return this;
   }

   public static byte[] N(ByteBuf var0) {
      return N(var0, var0.readableBytes());
   }

   public class00667 N(byte[] var1) {
      N(this, var1);
      return this;
   }

   public <T> List<T> N_16(class02895<? super class00667, T> var1) {
      return this.N_15(Lists::newArrayListWithCapacity, var1);
   }

   public <T> void N_12(Collection<T> var1, class02874<? super class00667, T> var2) {
      this.L(var1.size());

      for (Object object : var1) {
         var2.encode(this, object);
      }
   }

   public <T, C extends Collection<T>> C N_15(IntFunction<C> var1, class02895<? super class00667, T> var2) {
      int ix = this.E();
      Collection collection = (Collection)var1.apply(this.t(ix));

      for (int j = 0; j < ix; j++) {
         collection.add(var2.decode(this));
      }

      return (C)collection;
   }

   public static <T> IntFunction<T> N(IntFunction<T> var0, int var1) {
      return var2 -> {
         if (var2 > var1) {
            throw new DecoderException("Value " + var2 + " is larger than limit " + var1);
         } else {
            return (T)var0.apply(var2);
         }
      };
   }

   public IntList N() {
      int ix = this.E();
      IntArrayList intarraylist = new IntArrayList();

      for (int j = 0; j < ix; j++) {
         intarraylist.add(this.E());
      }

      return intarraylist;
   }

   public class00667 N(Object var1) {
      this.L.touch(var1);
      return this;
   }

   @Deprecated
   public <T> T N(DynamicOps<class07709> var1, Codec<T> var2, class07726 var3) {
      class07709 class07709 = this.N(var3);
      return (T)var2.parse(var1, class07709).getOrThrow(var1x -> new DecoderException("Failed to decode: " + var1x + " " + class07709));
   }

   @Deprecated
   public <T> class00667 N(DynamicOps<class07709> var1, Codec<T> var2, T var3) {
      class07709 class07709 = (class07709)var2.encodeStart(var1, var3).getOrThrow(var1x -> new EncoderException("Failed to encode: " + var1x + " " + var3));
      this.N(class07709);
      return this;
   }

   public <T> T N(Codec<T> var1) {
      JsonElement jsonelement = class08314.N(this.s());
      return (T)var1.parse(JsonOps.INSTANCE, jsonelement).getOrThrow(var0 -> new DecoderException("Failed to decode JSON: " + var0));
   }

   public <T> void N(Codec<T> var1, T var2) {
      DataResult dataresult = var1.encodeStart(JsonOps.INSTANCE, var2);
      this.N(M.toJson((JsonElement)dataresult.getOrThrow(var1x -> new EncoderException("Failed to encode: " + var1x + " " + var2))));
   }

   public <L, R> void N(Either<L, R> var1, class02874<? super class00667, L> var2, class02874<? super class00667, R> var3) {
      var1.ifLeft(var2x -> {
         this.writeBoolean(true);
         var2.encode(this, var2x);
      }).ifRight(var2x -> {
         this.writeBoolean(false);
         var3.encode(this, var2x);
      });
   }

   public <T> void N_13(Optional<T> var1, class02874<? super class00667, T> var2) {
      if (var1.isPresent()) {
         this.writeBoolean(true);
         var2.encode(this, var1.get());
      } else {
         this.writeBoolean(false);
      }
   }

   public <E extends Enum<E>> EnumSet<E> N(Class<E> var1) {
      Enum[] aenum = (Enum[])var1.getEnumConstants();
      BitSet bitset = this.i(aenum.length);
      EnumSet enumset = EnumSet.noneOf(var1);

      for (int ix = 0; ix < aenum.length; ix++) {
         if (bitset.get(ix)) {
            enumset.add((E)aenum[ix]);
         }
      }

      return enumset;
   }

   public <E extends Enum<E>> void N(EnumSet<E> var1, Class<E> var2) {
      Enum[] aenum = (Enum[])var2.getEnumConstants();
      BitSet bitset = new BitSet(aenum.length);

      for (int ix = 0; ix < aenum.length; ix++) {
         bitset.set(ix, var1.contains(aenum[ix]));
      }

      this.N(bitset, aenum.length);
   }

   @Nullable
   public static <T, B extends ByteBuf> T N(B var0, class02895<? super B, T> var1) {
      return (T)(var0.readBoolean() ? var1.decode(var0) : null);
   }

   public <T> void N(@Nullable T var1, class02874<? super class00667, T> var2) {
      N(this, var1, var2);
   }

   public class00667 writeDouble(double var1) {
      this.L.writeDouble(var1);
      return this;
   }

   public void N(IntList var1) {
      this.L(var1.size());
      var1.forEach(this::L);
   }

   public <K, V, M extends Map<K, V>> M N(IntFunction<M> var1, class02895<? super class00667, K> var2, class02895<? super class00667, V> var3) {
      int ix = this.E();
      Map map = (Map)var1.apply(this.t(ix));

      for (int j = 0; j < ix; j++) {
         Object object = var2.decode(this);
         Object object1 = var3.decode(this);
         map.put(object, object1);
      }

      return (M)map;
   }

   public <K, V> Map<K, V> N_17(class02895<? super class00667, K> var1, class02895<? super class00667, V> var2) {
      return this.N(Maps::newHashMapWithExpectedSize, var1, var2);
   }

   public <K, V> void N(Map<K, V> var1, class02874<? super class00667, K> var2, class02874<? super class00667, V> var3) {
      this.L(var1.size());
      var1.forEach((var3x, var4) -> {
         var2.encode(this, var3x);
         var3.encode(this, var4);
      });
   }

   public void N_14(Consumer<class00667> var1) {
      int ix = this.E();

      for (int j = 0; j < ix; j++) {
         var1.accept(this);
      }
   }

   public void N(BitSet var1) {
      this.N(var1.toLongArray());
   }

   public <T> T N(IntFunction<T> var1) {
      int ix = this.E();
      return (T)var1.apply(ix);
   }

   public class00667 getBytes(int var1, byte[] var2, int var3, int var4) {
      this.L.getBytes(var1, var2, var3, var4);
      return this;
   }

   public void N(class06183 var1) {
      class07209 class07209 = var1.u();
      this.N(class07209);
      this.N((Enum<?>)var1.i());
      class06889 class06889 = var1.y();
      this.writeFloat((float)(class06889.M - class07209.method_10263()));
      this.writeFloat((float)(class06889.B - class07209.method_10264()));
      this.writeFloat((float)(class06889.Z - class07209.method_10260()));
      this.writeBoolean(var1.R());
      this.writeBoolean(var1.M());
   }

   public class00667 N(Enum<?> var1) {
      return this.L(var1.ordinal());
   }

   public void N(BitSet var1, int var2) {
      if (var1.length() > var2) {
         throw new EncoderException("BitSet is larger than expected size (" + var1.length() + ">" + var2 + ")");
      } else {
         byte[] abyte = var1.toByteArray();
         this.writeBytes(Arrays.copyOf(abyte, class04995.R(var2, 8)));
      }
   }

   public class00667 getBytes(int var1, byte[] var2) {
      this.L.getBytes(var1, var2);
      return this;
   }

   public class00667 setBoolean(int var1, boolean var2) {
      this.L.setBoolean(var1, var2);
      return this;
   }

   public class00667 N(PublicKey var1) {
      this.N(var1.getEncoded());
      return this;
   }

   public static void N(ByteBuf var0, long[] var1) {
      class01657.N(var0, var1.length);
      y(var0, var1);
   }

   public class00667 N(long[] var1) {
      N(this, var1);
      return this;
   }

   public <T> class00667 N(ToIntFunction<T> var1, T var2) {
      int ix = var1.applyAsInt(var2);
      return this.L(ix);
   }

   public class00667 getBytes(int var1, OutputStream var2, int var3) throws IOException {
      this.L.getBytes(var1, var2, var3);
      return this;
   }

   public class00667 getBytes(int var1, ByteBuffer var2) {
      this.L.getBytes(var1, var2);
      return this;
   }

   public class00667 N(class07321 var1) {
      this.writeLong(var1.y());
      return this;
   }

   public void N(Quaternionf var1) {
      N(this, var1);
   }

   public static void N(ByteBuf var0, Quaternionfc var1) {
      var0.writeFloat(var1.x());
      var0.writeFloat(var1.y());
      var0.writeFloat(var1.z());
      var0.writeFloat(var1.w());
   }

   public static void N(ByteBuf var0, class07209 var1) {
      var0.writeLong(var1.method_10063());
   }

   public static void N(ByteBuf var0, Vector3fc var1) {
      var0.writeFloat(var1.x());
      var0.writeFloat(var1.y());
      var0.writeFloat(var1.z());
   }

   public void N(Vector3f var1) {
      N(this, var1);
   }

   public static void N(ByteBuf var0, class07321 var1) {
      var0.writeLong(var1.y());
   }

   public void N(class06889 var1) {
      N(this, var1);
   }

   public class00667 getBytes(int var1, ByteBuf var2) {
      this.L.getBytes(var1, var2);
      return this;
   }

   public class00667 getBytes(int var1, ByteBuf var2, int var3) {
      this.L.getBytes(var1, var2, var3);
      return this;
   }

   public class00667 getBytes(int var1, ByteBuf var2, int var3, int var4) {
      this.L.getBytes(var1, var2, var3, var4);
      return this;
   }

   public class00667 N(class07209 var1) {
      N(this, var1);
      return this;
   }

   public static void N(ByteBuf var0, class06889 var1) {
      var0.writeDouble(var1.N());
      var0.writeDouble(var1.y());
      var0.writeDouble(var1.L());
   }

   public class00667 setIndex(int var1, int var2) {
      this.L.setIndex(var1, var2);
      return this;
   }

   public class00667 N(UUID var1) {
      N(this, var1);
      return this;
   }

   public void N(class06289 var1) {
      this.y(var1.N());
      this.N(var1.y());
   }

   public class00667 N(String var1) {
      return this.N(var1, 32767);
   }

   public class00667 N(String var1, int var2) {
      class01663.N(this.L, var1, var2);
      return this;
   }

   public class00667 N(class01894 var1) {
      this.N(var1.toString());
      return this;
   }

   public <T> class05946<T> N(class05946<? extends class00751<T>> var1) {
      class01894 class01894 = this.T();
      return class05946.N(var1, class01894);
   }

   public static void N(ByteBuf var0, @Nullable class07709 var1) {
      if (var1 == null) {
         var1 = class06997.y;
      }

      try {
         class07742.N_83((class07709)var1, new ByteBufOutputStream(var0));
      } catch (IOException ioexception) {
         throw new EncoderException(ioexception);
      }
   }

   public class00667 N(long var1) {
      class01674.N(this.L, var1);
      return this;
   }

   public static void N(ByteBuf var0, UUID var1) {
      var0.writeLong(var1.getMostSignificantBits());
      var0.writeLong(var1.getLeastSignificantBits());
   }

   @Nullable
   public static class07709 N(ByteBuf var0, class07726 var1) {
      try {
         class07709 class07709 = class07742.y(new ByteBufInputStream(var0), var1);
         return class07709.L() == 0 ? null : class07709;
      } catch (IOException ioexception) {
         throw new EncoderException(ioexception);
      }
   }

   @Nullable
   public class07709 N(class07726 var1) {
      return N(this, var1);
   }

   public class00667 N(int[] var1) {
      this.L(var1.length);

      for (int ix : var1) {
         this.L(ix);
      }

      return this;
   }

   public class00667 setFloat(int var1, float var2) {
      this.L.setFloat(var1, var2);
      return this;
   }

   public void N(Instant var1) {
      this.writeLong(var1.toEpochMilli());
   }

   public class00667 setDouble(int var1, double var2) {
      this.L.setDouble(var1, var2);
      return this;
   }

   public class00667 setLong(int var1, long var2) {
      this.L.setLong(var1, var2);
      return this;
   }

   public short readUnsignedByte() {
      return this.L.readUnsignedByte();
   }

   public int readUnsignedShort() {
      return this.L.readUnsignedShort();
   }

   public boolean readBoolean() {
      return this.L.readBoolean();
   }

   public byte readByte() {
      return this.L.readByte();
   }

   public short readShort() {
      return this.L.readShort();
   }

   public long readLong() {
      return this.L.readLong();
   }

   public double readDouble() {
      return this.L.readDouble();
   }

   public ByteBuf asReadOnly() {
      return this.L.asReadOnly();
   }

   public int readUnsignedMediumLE() {
      return this.L.readUnsignedMediumLE();
   }

   public int getUnsignedMediumLE(int var1) {
      return this.L.getUnsignedMediumLE(var1);
   }

   public int readUnsignedShortLE() {
      return this.L.readUnsignedShortLE();
   }

   public int maxFastWritableBytes() {
      return this.L.maxFastWritableBytes();
   }

   public int readableBytes() {
      return this.L.readableBytes();
   }

   public short getUnsignedByte(int var1) {
      return this.L.getUnsignedByte(var1);
   }

   public int getUnsignedShortLE(int var1) {
      return this.L.getUnsignedShortLE(var1);
   }

   public int setCharSequence(int var1, CharSequence var2, Charset var3) {
      return this.L.setCharSequence(var1, var2, var3);
   }

   public long getUnsignedInt(int var1) {
      return this.L.getUnsignedInt(var1);
   }

   public int getUnsignedMedium(int var1) {
      return this.L.getUnsignedMedium(var1);
   }

   public int readMediumLE() {
      return this.L.readMediumLE();
   }

   public int maxCapacity() {
      return this.L.maxCapacity();
   }

   public ByteBuf readRetainedSlice(int var1) {
      return this.L.readRetainedSlice(var1);
   }

   public int readUnsignedMedium() {
      return this.L.readUnsignedMedium();
   }

   public int getMediumLE(int var1) {
      return this.L.getMediumLE(var1);
   }

   public int bytesBefore(int var1, int var2, byte var3) {
      return this.L.bytesBefore(var1, var2, var3);
   }

   public int bytesBefore(int var1, byte var2) {
      return this.L.bytesBefore(var1, var2);
   }

   public int bytesBefore(byte var1) {
      return this.L.bytesBefore(var1);
   }

   public long readUnsignedInt() {
      return this.L.readUnsignedInt();
   }

   public ByteBuffer internalNioBuffer(int var1, int var2) {
      return this.L.internalNioBuffer(var1, var2);
   }

   public int ensureWritable(int var1, boolean var2) {
      return this.L.ensureWritable(var1, var2);
   }

   public boolean isContiguous() {
      return this.L.isContiguous();
   }

   public CharSequence readCharSequence(int var1, Charset var2) {
      return this.L.readCharSequence(var1, var2);
   }

   public int writeCharSequence(CharSequence var1, Charset var2) {
      return this.L.writeCharSequence(var1, var2);
   }

   public long memoryAddress() {
      return this.L.memoryAddress();
   }

   public boolean hasMemoryAddress() {
      return this.L.hasMemoryAddress();
   }

   public long getUnsignedIntLE(int var1) {
      return this.L.getUnsignedIntLE(var1);
   }

   public int writableBytes() {
      return this.L.writableBytes();
   }

   public int writerIndex() {
      return this.L.writerIndex();
   }

   public ByteBuf retainedSlice() {
      return this.L.retainedSlice();
   }

   public ByteBuf retainedSlice(int var1, int var2) {
      return this.L.retainedSlice(var1, var2);
   }

   public int nioBufferCount() {
      return this.L.nioBufferCount();
   }

   public int maxWritableBytes() {
      return this.L.maxWritableBytes();
   }

   public short readShortLE() {
      return this.L.readShortLE();
   }

   public ByteBuf retainedDuplicate() {
      return this.L.retainedDuplicate();
   }

   public int readerIndex() {
      return this.L.readerIndex();
   }

   public CharSequence getCharSequence(int var1, int var2, Charset var3) {
      return this.L.getCharSequence(var1, var2, var3);
   }

   public long readUnsignedIntLE() {
      return this.L.readUnsignedIntLE();
   }

   public int readMedium() {
      return this.L.readMedium();
   }

   public ByteBuffer nioBuffer() {
      return this.L.nioBuffer();
   }

   public ByteBuffer nioBuffer(int var1, int var2) {
      return this.L.nioBuffer(var1, var2);
   }

   public int setBytes(int var1, ScatteringByteChannel var2, int var3) throws IOException {
      return this.L.setBytes(var1, var2, var3);
   }

   public int setBytes(int var1, FileChannel var2, long var3, int var5) throws IOException {
      return this.L.setBytes(var1, var2, var3, var5);
   }

   public int setBytes(int var1, InputStream var2, int var3) throws IOException {
      return this.L.setBytes(var1, var2, var3);
   }

   public long getLongLE(int var1) {
      return this.L.getLongLE(var1);
   }

   public int getMedium(int var1) {
      return this.L.getMedium(var1);
   }

   public short getShortLE(int var1) {
      return this.L.getShortLE(var1);
   }

   public long readLongLE() {
      return this.L.readLongLE();
   }

   public int getIntLE(int var1) {
      return this.L.getIntLE(var1);
   }

   public int readIntLE() {
      return this.L.readIntLE();
   }

   public ByteBuf readSlice(int var1) {
      return this.L.readSlice(var1);
   }

   public ByteBuffer[] nioBuffers() {
      return this.L.nioBuffers();
   }

   public ByteBuffer[] nioBuffers(int var1, int var2) {
      return this.L.nioBuffers(var1, var2);
   }

   public int refCnt() {
      return this.L.refCnt();
   }

   public ByteBufAllocator alloc() {
      return this.L.alloc();
   }

   public class00667 writeShort(int var1) {
      this.L.writeShort(var1);
      return this;
   }

   public long W() {
      return class01674.N(this.L);
   }

   public class07321 R() {
      return new class07321(this.readLong());
   }

   public static Quaternionf R(ByteBuf var0) {
      return new Quaternionf(var0.readFloat(), var0.readFloat(), var0.readFloat(), var0.readFloat());
   }

   public void R(int var1) {
      y(this.L, var1);
   }

   public class00667 setMediumLE(int var1, int var2) {
      this.L.setMediumLE(var1, var2);
      return this;
   }

   public class00667 discardSomeReadBytes() {
      this.L.discardSomeReadBytes();
      return this;
   }

   public int G() {
      return z(this.L);
   }

   public class00667 resetWriterIndex() {
      this.L.resetWriterIndex();
      return this;
   }

   public int forEachByte(ByteProcessor var1) {
      return this.L.forEachByte(var1);
   }

   public int forEachByte(int var1, int var2, ByteProcessor var3) {
      return this.L.forEachByte(var1, var2, var3);
   }

   public int forEachByteDesc(int var1, int var2, ByteProcessor var3) {
      return this.L.forEachByteDesc(var1, var2, var3);
   }

   public int forEachByteDesc(ByteProcessor var1) {
      return this.L.forEachByteDesc(var1);
   }
}
