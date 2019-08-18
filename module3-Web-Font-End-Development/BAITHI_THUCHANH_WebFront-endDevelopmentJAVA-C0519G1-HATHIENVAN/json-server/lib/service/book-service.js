'use strict';

const Book = require('../entity/book');

class BookService {

  constructor() {
    /** @private **/
    this.id = 0;
    this.all = [new Book().withId(this.id++).withName('Elon Musk').readed(true), new Book().withId(this.id++).withName('Getting Things Done').readed(true), new Book().withId(this.id++).withName('Long Kinh').readed(true), new Book().withId(this.id++).withName('Sapiens').readed(false), new Book().withId(this.id++).withName('Toi di Code dao').readed(false), new Book().withId(this.id++).withName('Hoc nghe').readed(false), new Book().withId(this.id++).withName('Clean Code').readed(false)];
  }

  getAll() {
    return this.all;
  }

  get(id) {
    return this.all.find(b => b.id === id);
  }

  add(book) {
    book = book.withId(this.id++);
    this.all.push(book);
    return book;
  }

  update(book) {
    let toUpdate = this.get(book.id);
    if (!!toUpdate) {
      toUpdate.name = book.name;
      toUpdate.read = book.read;
    }
    return toUpdate;
  }

  patch(book) {
    let toUpdate = this.get(book.id);
    if (!!toUpdate) {
      if (book.name !== undefined) toUpdate.name = book.name;
      if (book.read !== undefined) toUpdate.read = book.read;
    }
    return toUpdate;
  }
}

module.exports = BookService;