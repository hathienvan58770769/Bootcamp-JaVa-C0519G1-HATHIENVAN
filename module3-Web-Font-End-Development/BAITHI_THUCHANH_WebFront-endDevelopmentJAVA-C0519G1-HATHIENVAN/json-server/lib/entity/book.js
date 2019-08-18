import t from "flow-runtime";
@t.annotate(t.class("Book", t.property("id", t.number()), t.property("name", t.string()), t.property("read", t.boolean()), t.method("constructor", t.param("id", t.any()), t.param("name", t.any()), t.param("read", t.any())), t.method("withId", t.param("id", t.any())), t.method("withName", t.param("name", t.any())), t.method("readed", t.param("read", t.any()))))
class Book {

  constructor(id, name, read) {
    this.id = id;
    this.name = name;
    this.read = read;
  }

  withId(id) {
    return new Book(id, this.name, this.read);
  }

  withName(name) {
    return new Book(this.id, name, this.read);
  }

  readed(read) {
    return new Book(this.id, this.name, !!read);
  }
}

module.exports = Book;