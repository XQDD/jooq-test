/*
 * This file is generated by jOOQ.
 */
package com.xqdd.test.jooq;


import com.xqdd.test.jooq.tables.Author;
import com.xqdd.test.jooq.tables.Book;
import com.xqdd.test.jooq.tables.records.AuthorRecord;
import com.xqdd.test.jooq.tables.records.BookRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>PUBLIC</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AuthorRecord, Integer> IDENTITY_AUTHOR = Identities0.IDENTITY_AUTHOR;
    public static final Identity<BookRecord, Integer> IDENTITY_BOOK = Identities0.IDENTITY_BOOK;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorRecord> CONSTRAINT_7 = UniqueKeys0.CONSTRAINT_7;
    public static final UniqueKey<BookRecord> CONSTRAINT_1 = UniqueKeys0.CONSTRAINT_1;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<BookRecord, AuthorRecord> FK5GBO4O7YXEFXIVWUQJICHC67T = ForeignKeys0.FK5GBO4O7YXEFXIVWUQJICHC67T;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<AuthorRecord, Integer> IDENTITY_AUTHOR = Internal.createIdentity(Author.AUTHOR, Author.AUTHOR.ID);
        public static Identity<BookRecord, Integer> IDENTITY_BOOK = Internal.createIdentity(Book.BOOK, Book.BOOK.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<AuthorRecord> CONSTRAINT_7 = Internal.createUniqueKey(Author.AUTHOR, "CONSTRAINT_7", Author.AUTHOR.ID);
        public static final UniqueKey<BookRecord> CONSTRAINT_1 = Internal.createUniqueKey(Book.BOOK, "CONSTRAINT_1", Book.BOOK.ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<BookRecord, AuthorRecord> FK5GBO4O7YXEFXIVWUQJICHC67T = Internal.createForeignKey(com.xqdd.test.jooq.Keys.CONSTRAINT_7, Book.BOOK, "FK5GBO4O7YXEFXIVWUQJICHC67T", Book.BOOK.AUTHOR_ID);
    }
}
