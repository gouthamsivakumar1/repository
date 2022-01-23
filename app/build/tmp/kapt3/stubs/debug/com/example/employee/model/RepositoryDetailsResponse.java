package com.example.employee.model;

import java.lang.System;

@androidx.room.Entity(tableName = "RepositoryDetailsResponse")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b7\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0003\b\u00c0\u0001\b\u0087\b\u0018\u00002\u00020\u0001B\u00e5\u0006\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\'\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0005\u0012\b\u00100\u001a\u0004\u0018\u00010\u0005\u0012\b\u00101\u001a\u0004\u0018\u00010\u0005\u0012\b\u00102\u001a\u0004\u0018\u00010\u0005\u0012\b\u00103\u001a\u0004\u0018\u00010\u0005\u0012\b\u00104\u001a\u0004\u0018\u00010\u0005\u0012\b\u00105\u001a\u0004\u0018\u00010\u0005\u0012\b\u00106\u001a\u0004\u0018\u00010\u0005\u0012\b\u00107\u001a\u0004\u0018\u00010\u0005\u0012\b\u00108\u001a\u0004\u0018\u00010\u0005\u0012\b\u00109\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010;\u001a\u00020\u0003\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010A\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010C\u0012\b\u0010D\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010E\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010F\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010G\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010H\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010I\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010J\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010K\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010L\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010M\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010N\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010O\u001a\u0004\u0018\u00010P\u0012\b\u0010Q\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010R\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010S\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010T\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010U\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010V\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010W\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010X\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010Y\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010Z\u001a\u0004\u0018\u00010[\u0012\b\u0010\\\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010]\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010^\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010_J\u0011\u0010\u00bf\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010}J\f\u0010\u00c0\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00c1\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00c2\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00c3\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00c4\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00c5\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00c6\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00c7\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00c8\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00c9\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00ca\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00cb\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00cc\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00cd\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00ce\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00cf\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00d0\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00d1\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00d2\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00d3\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00d4\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00d5\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00d6\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00d8\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00d9\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00da\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00db\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00dc\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00dd\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00de\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00df\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00e0\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00e1\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00e2\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00e3\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00e4\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00e5\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00e6\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00e7\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00e8\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00e9\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00ea\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00eb\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\f\u0010\u00ec\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00ed\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00ee\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00ef\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\n\u0010\u00f0\u0001\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u00f1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010}J\u0011\u0010\u00f2\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010}J\u0011\u0010\u00f3\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010}J\f\u0010\u00f4\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00f5\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010}J\u0011\u0010\u00f6\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010aJ\u0011\u0010\u00f7\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010aJ\u0012\u0010\u00f8\u0001\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010CH\u00c6\u0003J\u0011\u0010\u00f9\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010aJ\u0011\u0010\u00fa\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010aJ\u0011\u0010\u00fb\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010aJ\u0011\u0010\u00fc\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010aJ\u0011\u0010\u00fd\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010aJ\u0011\u0010\u00fe\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010aJ\u0011\u0010\u00ff\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010aJ\f\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0085\u0002\u001a\u0004\u0018\u00010PH\u00c6\u0003J\u0011\u0010\u0086\u0002\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010aJ\f\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u0089\u0002\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010aJ\u0011\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010aJ\u0011\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010aJ\f\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u008d\u0002\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010aJ\u0011\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010}J\u0011\u0010\u008f\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010}J\f\u0010\u0090\u0002\u001a\u0004\u0018\u00010[H\u00c6\u0003J\u0011\u0010\u0091\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010}J\u0011\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010}J\u0011\u0010\u0093\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010}J\u0011\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010aJ\u009c\b\u0010\u0095\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010;\u001a\u00020\u00032\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010C2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010O\u001a\u0004\u0018\u00010P2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010[2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0003\u0010\u0096\u0002J\u0015\u0010\u0097\u0002\u001a\u00020\u000b2\t\u0010\u0098\u0002\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u0099\u0002\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u009a\u0002\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010U\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010b\u001a\u0004\b`\u0010aR\u001a\u0010W\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010b\u001a\u0004\bc\u0010aR\u001a\u0010Q\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010b\u001a\u0004\bd\u0010aR\u001a\u0010T\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010b\u001a\u0004\be\u0010aR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u001a\u0010I\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010b\u001a\u0004\bh\u0010aR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u0010gR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010gR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010gR\u0018\u00105\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010gR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010gR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010gR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010gR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010gR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010gR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010gR\u0018\u0010M\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010gR\u0018\u0010?\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bt\u0010gR\u001a\u0010V\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010b\u001a\u0004\bu\u0010aR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bv\u0010gR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bw\u0010gR\u001a\u0010J\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010b\u001a\u0004\bx\u0010aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\by\u0010gR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bz\u0010gR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010b\u001a\u0004\b{\u0010aR\u001a\u0010\\\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010~\u001a\u0004\b|\u0010}R\u0017\u0010;\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010gR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010gR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010gR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010gR\u0019\u0010 \u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010gR\u0019\u0010!\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010gR\u001b\u0010H\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010b\u001a\u0005\b\u0087\u0001\u0010aR\u001b\u0010D\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010b\u001a\u0005\b\u0088\u0001\u0010aR\u001b\u0010G\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010b\u001a\u0005\b\u0089\u0001\u0010aR\u001b\u0010E\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010b\u001a\u0005\b\u008a\u0001\u0010aR\u001b\u0010F\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010b\u001a\u0005\b\u008b\u0001\u0010aR\u0019\u00109\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010gR\u0019\u00107\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010gR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010gR\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u008f\u0001\u0010}R\u001a\u0010A\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010b\u001a\u0004\bA\u0010aR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010gR\u0019\u0010#\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010gR\u0019\u0010$\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010gR\u0019\u0010%\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010gR\u0019\u0010&\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010gR\u0019\u0010:\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010gR\u0019\u0010\'\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010gR\u001a\u0010Z\u001a\u0004\u0018\u00010[8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0019\u0010(\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010gR\u0019\u0010)\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010gR\u0019\u00106\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009b\u0001\u0010gR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010gR\u001b\u0010Y\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u009d\u0001\u0010}R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010gR\u0019\u0010*\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009f\u0001\u0010gR\u001b\u0010]\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u00a0\u0001\u0010}R\u001b\u0010@\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u00a1\u0001\u0010}R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00a2\u0001\u0010\u00a3\u0001R\u001a\u0010O\u001a\u0004\u0018\u00010P8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00a4\u0001\u0010\u00a5\u0001R\u001b\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010b\u001a\u0005\b\u00a6\u0001\u0010aR\u0019\u0010+\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a7\u0001\u0010gR\u0019\u0010L\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a8\u0001\u0010gR\u0019\u0010,\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a9\u0001\u0010gR\u001b\u0010>\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u00aa\u0001\u0010}R\u0019\u0010-\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ab\u0001\u0010gR\u001b\u0010<\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u00ac\u0001\u0010}R\u0019\u0010.\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ad\u0001\u0010gR\u0019\u0010/\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ae\u0001\u0010gR\u001b\u0010X\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u00af\u0001\u0010}R\u0019\u00100\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b0\u0001\u0010gR\u0019\u00101\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b1\u0001\u0010gR\u0019\u00108\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b2\u0001\u0010gR\u0019\u00102\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b3\u0001\u0010gR\u0019\u00103\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b4\u0001\u0010gR\u0019\u0010S\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b5\u0001\u0010gR\u0019\u0010R\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b6\u0001\u0010gR \u0010B\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010C8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00b7\u0001\u0010\u00b8\u0001R\u0019\u00104\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b9\u0001\u0010gR\u0019\u0010N\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ba\u0001\u0010gR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00bb\u0001\u0010gR\u0019\u0010K\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00bc\u0001\u0010gR\u001b\u0010^\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u00bd\u0001\u0010}R\u001b\u0010=\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010~\u001a\u0005\b\u00be\u0001\u0010}\u00a8\u0006\u009b\u0002"}, d2 = {"Lcom/example/employee/model/RepositoryDetailsResponse;", "", "id", "", "node_id", "", "name", "full_name", "owner", "Lcom/example/employee/model/Owner;", "private", "", "html_url", "description", "fork", "url", "archive_url", "assignees_url", "blobs_url", "branches_url", "collaborators_url", "comments_url", "commits_url", "compare_url", "contents_url", "contributors_url", "deployments_url", "downloads_url", "events_url", "forks_url", "git_commits_url", "git_refs_url", "git_tags_url", "git_url", "issue_comment_url", "issue_events_url", "issues_url", "keys_urls_url", "labels_url", "languages_url", "merges_url", "milestones_url", "notifications_url", "pulls_url", "releases_url", "ssh_url", "stargazers_url", "statuses_url", "subscribers_url", "subscription_url", "tags_url", "teams_url", "trees_url", "clone_url", "mirror_url", "hooks_url", "svn_url", "homepage", "language", "forks_count", "stargazers_count", "watchers_count", "size", "default_branch", "open_issues_count", "is_template", "topics", "", "has_issues", "has_projects", "has_wiki", "has_pages", "has_downloads", "archived", "disabled", "visibility", "pushed_at", "created_at", "updated_at", "permissions", "Lcom/example/employee/model/Permissions;", "allow_rebase_merge", "template_repository", "temp_clone_token", "allow_squash_merge", "allow_auto_merge", "delete_branch_on_merge", "allow_merge_commit", "subscribers_count", "network_count", "license", "Lcom/example/employee/model/Licensed;", "forks", "open_issues", "watchers", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/employee/model/Owner;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/employee/model/Permissions;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/example/employee/model/Licensed;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAllow_auto_merge", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAllow_merge_commit", "getAllow_rebase_merge", "getAllow_squash_merge", "getArchive_url", "()Ljava/lang/String;", "getArchived", "getAssignees_url", "getBlobs_url", "getBranches_url", "getClone_url", "getCollaborators_url", "getComments_url", "getCommits_url", "getCompare_url", "getContents_url", "getContributors_url", "getCreated_at", "getDefault_branch", "getDelete_branch_on_merge", "getDeployments_url", "getDescription", "getDisabled", "getDownloads_url", "getEvents_url", "getFork", "getForks", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getForks_count", "()I", "getForks_url", "getFull_name", "getGit_commits_url", "getGit_refs_url", "getGit_tags_url", "getGit_url", "getHas_downloads", "getHas_issues", "getHas_pages", "getHas_projects", "getHas_wiki", "getHomepage", "getHooks_url", "getHtml_url", "getId", "getIssue_comment_url", "getIssue_events_url", "getIssues_url", "getKeys_urls_url", "getLabels_url", "getLanguage", "getLanguages_url", "getLicense", "()Lcom/example/employee/model/Licensed;", "getMerges_url", "getMilestones_url", "getMirror_url", "getName", "getNetwork_count", "getNode_id", "getNotifications_url", "getOpen_issues", "getOpen_issues_count", "getOwner", "()Lcom/example/employee/model/Owner;", "getPermissions", "()Lcom/example/employee/model/Permissions;", "getPrivate", "getPulls_url", "getPushed_at", "getReleases_url", "getSize", "getSsh_url", "getStargazers_count", "getStargazers_url", "getStatuses_url", "getSubscribers_count", "getSubscribers_url", "getSubscription_url", "getSvn_url", "getTags_url", "getTeams_url", "getTemp_clone_token", "getTemplate_repository", "getTopics", "()Ljava/util/List;", "getTrees_url", "getUpdated_at", "getUrl", "getVisibility", "getWatchers", "getWatchers_count", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "component79", "component8", "component80", "component81", "component82", "component83", "component84", "component85", "component86", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/employee/model/Owner;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/employee/model/Permissions;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/example/employee/model/Licensed;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/example/employee/model/RepositoryDetailsResponse;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class RepositoryDetailsResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id")
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "node_id")
    private final java.lang.String node_id = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "full_name")
    private final java.lang.String full_name = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "owner")
    private final com.example.employee.model.Owner owner = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "html_url")
    private final java.lang.String html_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "description")
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "fork")
    private final java.lang.Boolean fork = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "url")
    private final java.lang.String url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "archive_url")
    private final java.lang.String archive_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "assignees_url")
    private final java.lang.String assignees_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "blobs_url")
    private final java.lang.String blobs_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "branches_url")
    private final java.lang.String branches_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "collaborators_url")
    private final java.lang.String collaborators_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "comments_url")
    private final java.lang.String comments_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "commits_url")
    private final java.lang.String commits_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "compare_url")
    private final java.lang.String compare_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "contents_url")
    private final java.lang.String contents_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "contributors_url")
    private final java.lang.String contributors_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "deployments_url")
    private final java.lang.String deployments_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "downloads_url")
    private final java.lang.String downloads_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "events_url")
    private final java.lang.String events_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "forks_url")
    private final java.lang.String forks_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "git_commits_url")
    private final java.lang.String git_commits_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "git_refs_url")
    private final java.lang.String git_refs_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "git_tags_url")
    private final java.lang.String git_tags_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "git_url")
    private final java.lang.String git_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "issue_comment_url")
    private final java.lang.String issue_comment_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "issue_events_url")
    private final java.lang.String issue_events_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "issues_url")
    private final java.lang.String issues_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "keys_url")
    private final java.lang.String keys_urls_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "labels_url")
    private final java.lang.String labels_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "languages_url")
    private final java.lang.String languages_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "merges_url")
    private final java.lang.String merges_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "milestones_url")
    private final java.lang.String milestones_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "notifications_url")
    private final java.lang.String notifications_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "pulls_url")
    private final java.lang.String pulls_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "releases_url")
    private final java.lang.String releases_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ssh_url")
    private final java.lang.String ssh_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "stargazers_url")
    private final java.lang.String stargazers_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "statuses_url")
    private final java.lang.String statuses_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "subscribers_url")
    private final java.lang.String subscribers_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "subscription_url")
    private final java.lang.String subscription_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "tags_url")
    private final java.lang.String tags_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "teams_url")
    private final java.lang.String teams_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "trees_url")
    private final java.lang.String trees_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "clone_url")
    private final java.lang.String clone_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "mirror_url")
    private final java.lang.String mirror_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "hooks_url")
    private final java.lang.String hooks_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "svn_url")
    private final java.lang.String svn_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "homepage")
    private final java.lang.String homepage = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "language")
    private final java.lang.String language = null;
    @com.google.gson.annotations.SerializedName(value = "forks_count")
    private final int forks_count = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "stargazers_count")
    private final java.lang.Integer stargazers_count = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "watchers_count")
    private final java.lang.Integer watchers_count = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "size")
    private final java.lang.Integer size = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "default_branch")
    private final java.lang.String default_branch = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "open_issues_count")
    private final java.lang.Integer open_issues_count = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "is_template")
    private final java.lang.Boolean is_template = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "topics")
    private final java.util.List<java.lang.String> topics = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "has_issues")
    private final java.lang.Boolean has_issues = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "has_projects")
    private final java.lang.Boolean has_projects = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "has_wiki")
    private final java.lang.Boolean has_wiki = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "has_pages")
    private final java.lang.Boolean has_pages = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "has_downloads")
    private final java.lang.Boolean has_downloads = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "archived")
    private final java.lang.Boolean archived = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "disabled")
    private final java.lang.Boolean disabled = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "visibility")
    private final java.lang.String visibility = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "pushed_at")
    private final java.lang.String pushed_at = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "created_at")
    private final java.lang.String created_at = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "updated_at")
    private final java.lang.String updated_at = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "permissions")
    private final com.example.employee.model.Permissions permissions = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "allow_rebase_merge")
    private final java.lang.Boolean allow_rebase_merge = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "template_repository")
    private final java.lang.String template_repository = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "temp_clone_token")
    private final java.lang.String temp_clone_token = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "allow_squash_merge")
    private final java.lang.Boolean allow_squash_merge = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "allow_auto_merge")
    private final java.lang.Boolean allow_auto_merge = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "delete_branch_on_merge")
    private final java.lang.Boolean delete_branch_on_merge = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "allow_merge_commit")
    private final java.lang.Boolean allow_merge_commit = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "subscribers_count")
    private final java.lang.Integer subscribers_count = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "network_count")
    private final java.lang.Integer network_count = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "license")
    private final com.example.employee.model.Licensed license = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "forks")
    private final java.lang.Integer forks = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "open_issues")
    private final java.lang.Integer open_issues = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "watchers")
    private final java.lang.Integer watchers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.employee.model.RepositoryDetailsResponse copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String node_id, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String full_name, @org.jetbrains.annotations.Nullable()
    com.example.employee.model.Owner owner, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean p5_1990234817, @org.jetbrains.annotations.Nullable()
    java.lang.String html_url, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean fork, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String archive_url, @org.jetbrains.annotations.Nullable()
    java.lang.String assignees_url, @org.jetbrains.annotations.Nullable()
    java.lang.String blobs_url, @org.jetbrains.annotations.Nullable()
    java.lang.String branches_url, @org.jetbrains.annotations.Nullable()
    java.lang.String collaborators_url, @org.jetbrains.annotations.Nullable()
    java.lang.String comments_url, @org.jetbrains.annotations.Nullable()
    java.lang.String commits_url, @org.jetbrains.annotations.Nullable()
    java.lang.String compare_url, @org.jetbrains.annotations.Nullable()
    java.lang.String contents_url, @org.jetbrains.annotations.Nullable()
    java.lang.String contributors_url, @org.jetbrains.annotations.Nullable()
    java.lang.String deployments_url, @org.jetbrains.annotations.Nullable()
    java.lang.String downloads_url, @org.jetbrains.annotations.Nullable()
    java.lang.String events_url, @org.jetbrains.annotations.Nullable()
    java.lang.String forks_url, @org.jetbrains.annotations.Nullable()
    java.lang.String git_commits_url, @org.jetbrains.annotations.Nullable()
    java.lang.String git_refs_url, @org.jetbrains.annotations.Nullable()
    java.lang.String git_tags_url, @org.jetbrains.annotations.Nullable()
    java.lang.String git_url, @org.jetbrains.annotations.Nullable()
    java.lang.String issue_comment_url, @org.jetbrains.annotations.Nullable()
    java.lang.String issue_events_url, @org.jetbrains.annotations.Nullable()
    java.lang.String issues_url, @org.jetbrains.annotations.Nullable()
    java.lang.String keys_urls_url, @org.jetbrains.annotations.Nullable()
    java.lang.String labels_url, @org.jetbrains.annotations.Nullable()
    java.lang.String languages_url, @org.jetbrains.annotations.Nullable()
    java.lang.String merges_url, @org.jetbrains.annotations.Nullable()
    java.lang.String milestones_url, @org.jetbrains.annotations.Nullable()
    java.lang.String notifications_url, @org.jetbrains.annotations.Nullable()
    java.lang.String pulls_url, @org.jetbrains.annotations.Nullable()
    java.lang.String releases_url, @org.jetbrains.annotations.Nullable()
    java.lang.String ssh_url, @org.jetbrains.annotations.Nullable()
    java.lang.String stargazers_url, @org.jetbrains.annotations.Nullable()
    java.lang.String statuses_url, @org.jetbrains.annotations.Nullable()
    java.lang.String subscribers_url, @org.jetbrains.annotations.Nullable()
    java.lang.String subscription_url, @org.jetbrains.annotations.Nullable()
    java.lang.String tags_url, @org.jetbrains.annotations.Nullable()
    java.lang.String teams_url, @org.jetbrains.annotations.Nullable()
    java.lang.String trees_url, @org.jetbrains.annotations.Nullable()
    java.lang.String clone_url, @org.jetbrains.annotations.Nullable()
    java.lang.String mirror_url, @org.jetbrains.annotations.Nullable()
    java.lang.String hooks_url, @org.jetbrains.annotations.Nullable()
    java.lang.String svn_url, @org.jetbrains.annotations.Nullable()
    java.lang.String homepage, @org.jetbrains.annotations.Nullable()
    java.lang.String language, int forks_count, @org.jetbrains.annotations.Nullable()
    java.lang.Integer stargazers_count, @org.jetbrains.annotations.Nullable()
    java.lang.Integer watchers_count, @org.jetbrains.annotations.Nullable()
    java.lang.Integer size, @org.jetbrains.annotations.Nullable()
    java.lang.String default_branch, @org.jetbrains.annotations.Nullable()
    java.lang.Integer open_issues_count, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_template, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> topics, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean has_issues, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean has_projects, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean has_wiki, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean has_pages, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean has_downloads, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean archived, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean disabled, @org.jetbrains.annotations.Nullable()
    java.lang.String visibility, @org.jetbrains.annotations.Nullable()
    java.lang.String pushed_at, @org.jetbrains.annotations.Nullable()
    java.lang.String created_at, @org.jetbrains.annotations.Nullable()
    java.lang.String updated_at, @org.jetbrains.annotations.Nullable()
    com.example.employee.model.Permissions permissions, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean allow_rebase_merge, @org.jetbrains.annotations.Nullable()
    java.lang.String template_repository, @org.jetbrains.annotations.Nullable()
    java.lang.String temp_clone_token, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean allow_squash_merge, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean allow_auto_merge, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean delete_branch_on_merge, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean allow_merge_commit, @org.jetbrains.annotations.Nullable()
    java.lang.Integer subscribers_count, @org.jetbrains.annotations.Nullable()
    java.lang.Integer network_count, @org.jetbrains.annotations.Nullable()
    com.example.employee.model.Licensed license, @org.jetbrains.annotations.Nullable()
    java.lang.Integer forks, @org.jetbrains.annotations.Nullable()
    java.lang.Integer open_issues, @org.jetbrains.annotations.Nullable()
    java.lang.Integer watchers) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public RepositoryDetailsResponse(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String node_id, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String full_name, @org.jetbrains.annotations.Nullable()
    com.example.employee.model.Owner owner, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean p5_1990234817, @org.jetbrains.annotations.Nullable()
    java.lang.String html_url, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean fork, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String archive_url, @org.jetbrains.annotations.Nullable()
    java.lang.String assignees_url, @org.jetbrains.annotations.Nullable()
    java.lang.String blobs_url, @org.jetbrains.annotations.Nullable()
    java.lang.String branches_url, @org.jetbrains.annotations.Nullable()
    java.lang.String collaborators_url, @org.jetbrains.annotations.Nullable()
    java.lang.String comments_url, @org.jetbrains.annotations.Nullable()
    java.lang.String commits_url, @org.jetbrains.annotations.Nullable()
    java.lang.String compare_url, @org.jetbrains.annotations.Nullable()
    java.lang.String contents_url, @org.jetbrains.annotations.Nullable()
    java.lang.String contributors_url, @org.jetbrains.annotations.Nullable()
    java.lang.String deployments_url, @org.jetbrains.annotations.Nullable()
    java.lang.String downloads_url, @org.jetbrains.annotations.Nullable()
    java.lang.String events_url, @org.jetbrains.annotations.Nullable()
    java.lang.String forks_url, @org.jetbrains.annotations.Nullable()
    java.lang.String git_commits_url, @org.jetbrains.annotations.Nullable()
    java.lang.String git_refs_url, @org.jetbrains.annotations.Nullable()
    java.lang.String git_tags_url, @org.jetbrains.annotations.Nullable()
    java.lang.String git_url, @org.jetbrains.annotations.Nullable()
    java.lang.String issue_comment_url, @org.jetbrains.annotations.Nullable()
    java.lang.String issue_events_url, @org.jetbrains.annotations.Nullable()
    java.lang.String issues_url, @org.jetbrains.annotations.Nullable()
    java.lang.String keys_urls_url, @org.jetbrains.annotations.Nullable()
    java.lang.String labels_url, @org.jetbrains.annotations.Nullable()
    java.lang.String languages_url, @org.jetbrains.annotations.Nullable()
    java.lang.String merges_url, @org.jetbrains.annotations.Nullable()
    java.lang.String milestones_url, @org.jetbrains.annotations.Nullable()
    java.lang.String notifications_url, @org.jetbrains.annotations.Nullable()
    java.lang.String pulls_url, @org.jetbrains.annotations.Nullable()
    java.lang.String releases_url, @org.jetbrains.annotations.Nullable()
    java.lang.String ssh_url, @org.jetbrains.annotations.Nullable()
    java.lang.String stargazers_url, @org.jetbrains.annotations.Nullable()
    java.lang.String statuses_url, @org.jetbrains.annotations.Nullable()
    java.lang.String subscribers_url, @org.jetbrains.annotations.Nullable()
    java.lang.String subscription_url, @org.jetbrains.annotations.Nullable()
    java.lang.String tags_url, @org.jetbrains.annotations.Nullable()
    java.lang.String teams_url, @org.jetbrains.annotations.Nullable()
    java.lang.String trees_url, @org.jetbrains.annotations.Nullable()
    java.lang.String clone_url, @org.jetbrains.annotations.Nullable()
    java.lang.String mirror_url, @org.jetbrains.annotations.Nullable()
    java.lang.String hooks_url, @org.jetbrains.annotations.Nullable()
    java.lang.String svn_url, @org.jetbrains.annotations.Nullable()
    java.lang.String homepage, @org.jetbrains.annotations.Nullable()
    java.lang.String language, int forks_count, @org.jetbrains.annotations.Nullable()
    java.lang.Integer stargazers_count, @org.jetbrains.annotations.Nullable()
    java.lang.Integer watchers_count, @org.jetbrains.annotations.Nullable()
    java.lang.Integer size, @org.jetbrains.annotations.Nullable()
    java.lang.String default_branch, @org.jetbrains.annotations.Nullable()
    java.lang.Integer open_issues_count, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_template, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> topics, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean has_issues, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean has_projects, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean has_wiki, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean has_pages, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean has_downloads, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean archived, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean disabled, @org.jetbrains.annotations.Nullable()
    java.lang.String visibility, @org.jetbrains.annotations.Nullable()
    java.lang.String pushed_at, @org.jetbrains.annotations.Nullable()
    java.lang.String created_at, @org.jetbrains.annotations.Nullable()
    java.lang.String updated_at, @org.jetbrains.annotations.Nullable()
    com.example.employee.model.Permissions permissions, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean allow_rebase_merge, @org.jetbrains.annotations.Nullable()
    java.lang.String template_repository, @org.jetbrains.annotations.Nullable()
    java.lang.String temp_clone_token, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean allow_squash_merge, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean allow_auto_merge, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean delete_branch_on_merge, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean allow_merge_commit, @org.jetbrains.annotations.Nullable()
    java.lang.Integer subscribers_count, @org.jetbrains.annotations.Nullable()
    java.lang.Integer network_count, @org.jetbrains.annotations.Nullable()
    com.example.employee.model.Licensed license, @org.jetbrains.annotations.Nullable()
    java.lang.Integer forks, @org.jetbrains.annotations.Nullable()
    java.lang.Integer open_issues, @org.jetbrains.annotations.Nullable()
    java.lang.Integer watchers) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNode_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFull_name() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.employee.model.Owner component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.employee.model.Owner getOwner() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getPrivate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHtml_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getFork() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getArchive_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAssignees_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBlobs_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBranches_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCollaborators_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getComments_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCommits_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompare_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContents_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContributors_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeployments_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDownloads_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEvents_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getForks_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGit_commits_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGit_refs_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGit_tags_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGit_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIssue_comment_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIssue_events_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIssues_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getKeys_urls_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLabels_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLanguages_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMerges_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component36() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMilestones_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component37() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNotifications_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component38() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPulls_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component39() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReleases_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component40() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSsh_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component41() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStargazers_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component42() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatuses_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component43() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubscribers_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component44() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubscription_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component45() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTags_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component46() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTeams_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component47() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTrees_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component48() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClone_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component49() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMirror_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component50() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHooks_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component51() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSvn_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component52() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHomepage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component53() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    public final int component54() {
        return 0;
    }
    
    public final int getForks_count() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component55() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStargazers_count() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component56() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWatchers_count() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component57() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSize() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component58() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDefault_branch() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component59() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOpen_issues_count() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component60() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean is_template() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component61() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getTopics() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component62() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getHas_issues() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component63() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getHas_projects() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component64() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getHas_wiki() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component65() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getHas_pages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component66() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getHas_downloads() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component67() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getArchived() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component68() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getDisabled() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component69() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component70() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPushed_at() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component71() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreated_at() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component72() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUpdated_at() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.employee.model.Permissions component73() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.employee.model.Permissions getPermissions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component74() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAllow_rebase_merge() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component75() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTemplate_repository() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component76() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTemp_clone_token() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component77() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAllow_squash_merge() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component78() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAllow_auto_merge() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component79() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getDelete_branch_on_merge() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component80() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAllow_merge_commit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component81() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSubscribers_count() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component82() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNetwork_count() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.employee.model.Licensed component83() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.employee.model.Licensed getLicense() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component84() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getForks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component85() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOpen_issues() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component86() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWatchers() {
        return null;
    }
}