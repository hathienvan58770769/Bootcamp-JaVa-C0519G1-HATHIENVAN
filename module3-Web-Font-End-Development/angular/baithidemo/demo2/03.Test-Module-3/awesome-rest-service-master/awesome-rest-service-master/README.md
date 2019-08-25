* Chạy `npm i -g json-server` để cài đặt gói `json-server`.
* Chạy `npm start` để có một restful webservice dùng cho bài test. 
Server được viết để nghe ở `:3000/awesomes`. (_Awesome_ là một bản 
ghi chứa một đường link có tài nguyên hữu ích trong lập trình).

```$json
{
  "awesomes": [
    {
      "id": 1,
      "url": "http://html5doctor.com",
      "descriptions": "Rất nhiều best pratice để xử lý các tình huống nhỏ thường gặp của html5"
    },
    {
      "id": 3,
      "tag": "javascript",
      "url": "https://medium.freecodecamp.org/the-evolution-of-async-javascript-from-callbacks-to-promises-to-async-await-e73b047f2f40",
      "descriptions": "lịch sử tiến hóa của javascript async"
    },
    {
      "id": 4,
      "tag": "xp",
      "url": "http://kata-log.rocks/index.html",
      "descriptions": "tài nguyên coding dojo"
    },
    {
      "id": 5,
      "tag": "html",
      "url": "https://html5doctor.com",
      "descriptions": "Rất nhiều best pratice để xử lý các tình huống nhỏ thường gặp của html5"
    }
  ]
}
```