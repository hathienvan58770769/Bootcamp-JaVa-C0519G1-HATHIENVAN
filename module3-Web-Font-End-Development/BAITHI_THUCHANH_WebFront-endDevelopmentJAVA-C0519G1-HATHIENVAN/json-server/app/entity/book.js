class Book {
  constructor (id, name, read) {
    this.id = id
    this.name = name
    this.read = read
  }

  withId (id) {
    return new Book(id, this.name, this.read)
  }

  withName (name) {
    return new Book(this.id, name, this.read)
  }

  readed (read) {
    return new Book(this.id, this.name, !!read)
  }
}

module.exports = Book
