##v0.1
Add real time drawing

- Change file structure and how files are served
- Fix custom invite URL
- Automatic connection

##v0.2
Basic functionality to allow for more features to be added

###v0.2.1
Room to document based model

- Add sidebar
- Change offset points to absolute points in draw
- Refactor packets
- Refactor js
- Event based WebSocketHandler
- Change how URLs work

###v0.2.2
Add document opening/closing

- Change how queued packets work
- Documents are saved before closed
- Change protocol again

###v0.2.3
Flat file data persistence

- Remove ConsoleManager
- Add shutdown hooks for saving
- Change handshake
- Functioning Java serialization
- Complete rework of config system
- SSL support

###v0.2.4
User identity

- Change URL parsing
- Add HTTP cache as a config option
- Session management
- Sessions are linked to documents
- Improve toString debug

###v0.2.5
Multiple clients per user

- Change how sessions are handled
- Clean up script loading
- Fix hashcode issues

###v0.2.6
Design
- Clean up CSS
- Add changelog
- Add invite/connected users toolbar
- "Fix" canvas resize
- Change/clean up config system
- Improve client debug
- Better local user with different handshake